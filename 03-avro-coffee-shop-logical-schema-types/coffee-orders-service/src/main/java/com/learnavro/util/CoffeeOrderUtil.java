package com.learnavro.util;

import com.github.javafaker.Faker;
import com.learnavro.domain.generated.*;

import java.util.List;
import java.util.Random;

public class CoffeeOrderUtil {
    private static final Faker FAKER = Faker.instance();

    public static CoffeeOrder buildNewCoffeeOrder() {
        return CoffeeOrder.newBuilder()
                .setId(randomId())
                .setName(FAKER.name().fullName())
                .setStore(generateStore())
                .setOrderLineItems(generateOrderLineItems())
                .setStatus("NEW")
                .build();
    }


    private static List<OrderLineItem> generateOrderLineItems() {
        var orderLineItem = OrderLineItem.newBuilder()
                .setName("Caffe Latte")
                .setQuantity(1)
                .setSize(Size.MEDIUM)
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