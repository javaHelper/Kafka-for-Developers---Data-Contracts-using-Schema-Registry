package com.learnavro.producer;

import com.learnavro.domain.generated.CoffeeOrder;
import com.learnavro.domain.generated.OrderId;
import com.learnavro.util.CoffeeOrderUtil;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import io.confluent.kafka.serializers.KafkaAvroSerializerConfig;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class CoffeeOrderProducerSchemaRegistry {
    private static final Logger log = LoggerFactory.getLogger(CoffeeOrderProducerSchemaRegistry.class);
    private static final String COFFEE_ORDERS = "coffee-orders-sr";

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class.getName());

        // If we don't use below, then exception will be thrown, to make this working, please use Generic Record instead
        // of CoffeeOrder
        properties.put(KafkaAvroSerializerConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");

        try (KafkaProducer<OrderId, CoffeeOrder> producer = new KafkaProducer<>(properties)) {
			CoffeeOrder coffeeOrder = CoffeeOrderUtil.buildNewCoffeeOrder();

			ProducerRecord<OrderId, CoffeeOrder> producerRecord =
			        new ProducerRecord<>(COFFEE_ORDERS, coffeeOrder.getId(), coffeeOrder);

			var recordMetaData = producer.send(producerRecord).get();
			log.info("recordMetaData : {}", recordMetaData);
		}
    }
}