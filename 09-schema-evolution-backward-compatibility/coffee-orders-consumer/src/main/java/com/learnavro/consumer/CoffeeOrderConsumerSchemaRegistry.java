package com.learnavro.consumer;

import com.learnavro.domain.generated.CoffeeOrder;
import com.learnavro.domain.generated.OrderId;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.Properties;

public class CoffeeOrderConsumerSchemaRegistry {
    private static final Logger log = LoggerFactory.getLogger(CoffeeOrderConsumerSchemaRegistry.class);
    private static final String COFFEE_ORDERS = "coffee-orders-sr";

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class.getName());
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class.getName());
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "coffee.consumer.sr");
        properties.put(KafkaAvroDeserializerConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");
        properties.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);

        try (KafkaConsumer<OrderId, CoffeeOrder> consumer = new KafkaConsumer<>(properties)) {
			consumer.subscribe(Collections.singletonList(COFFEE_ORDERS));
			log.info("Consumer Started");

			while(true){
			    ConsumerRecords<OrderId,CoffeeOrder> records  = consumer.poll(Duration.ofMillis(100));

			    for (ConsumerRecord<OrderId, CoffeeOrder> record : records){
			        try{
			            log.info("Consumed Message , key : {} , value : {}", record.key(), record.value().toString());
			            var coffeeOrder = record.value();

			            //ZoneId.SHORT_IDS
			            var utcDateTime = LocalDateTime.ofInstant(coffeeOrder.getOrderedTime(), ZoneOffset.UTC);
			            var cstDateTime = LocalDateTime.ofInstant(coffeeOrder.getOrderedTime(), ZoneId.of("America/Chicago"));
			            log.info("utcDateTime: {} , cstDateTime : {} ",utcDateTime,  cstDateTime);

			        }catch (Exception e){
			            log.error("Exception is : {} ", e.getMessage(), e);
			        }
			    }
			}
		}
    }
}