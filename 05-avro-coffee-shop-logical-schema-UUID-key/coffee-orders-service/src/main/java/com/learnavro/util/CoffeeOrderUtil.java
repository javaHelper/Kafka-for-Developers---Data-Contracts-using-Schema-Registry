package com.learnavro.util;

import com.github.javafaker.Faker;
import com.learnavro.domain.generated.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class CoffeeOrderUtil {
    private static final Faker FAKER = Faker.instance();

    public static CoffeeOrder buildNewCoffeeOrder() {
        return CoffeeOrder.newBuilder()
                .setId(UUID.randomUUID())
                .setName(FAKER.name().fullName())
                .setStore(generateStore())
                .setOrderLineItems(generateOrderLineItems())
                .setOrderedTime(Instant.now())
                .setStatus("NEW")
                .build();
    }


    private static List<OrderLineItem> generateOrderLineItems() {
        var orderLineItem = OrderLineItem.newBuilder()
                .setName("Caffe Latte")
                .setQuantity(1)
                .setSize(Size.MEDIUM)
                .setCost(BigDecimal.valueOf(3.99))
                .build();

        return List.of(orderLineItem);
    }

    private static Store generateStore() {
        return Store.newBuilder()
                .setId(randomId())
                .setAddress(buildAddress())
                .build();
    }

    private static Address buildAddress() {
        return Address.newBuilder()
                .setAddressLine1(FAKER.address().fullAddress())
                .setCity(FAKER.address().city())
                .setStateProvince(FAKER.address().state())
                .setZip(FAKER.address().zipCode())
                .build();
    }

    public static int randomId() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}