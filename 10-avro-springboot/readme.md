# AVRO Spring Boot 

```
curl --location 'http://localhost:8082/v1/coffee_orders' \
--header 'Content-Type: application/json' \
--data '{
    "id": "a27d9492-1402-48d6-9bf7-2c59c76e8a34",
    "name": "Dilip Sundarraj",
    "nickName": "",
    "store": {
        "storeId": 123,
        "address": {
            "addressLine1": "1234 street",
            "city": "Chicago",
            "state": "Illinois",
            "country": "USA",
            "zip": "11244"
        }
    },
    "orderLineItems": [
        {
            "name": "Latte",
            "size": "MEDIUM",
            "quantity": 1,
            "cost": 3.99
        }
    ],
    "pickUp": "IN_STORE",
    "orderedTime": "2022-08-24T04:46:28",
    "status": "NEW"
}'
```

<img width="654" alt="Screenshot 2023-07-12 at 9 01 37 PM" src="https://github.com/javaHelper/Kafka-for-Developers---Data-Contracts-using-Schema-Registry/assets/54174687/9089d82a-a740-43f9-b60e-588873e116e1">

<img width="1066" alt="Screenshot 2023-07-12 at 9 02 24 PM" src="https://github.com/javaHelper/Kafka-for-Developers---Data-Contracts-using-Schema-Registry/assets/54174687/e72e040e-c86b-4647-a8c3-612d32a343c3">

<img width="1446" alt="Screenshot 2023-07-12 at 9 03 17 PM" src="https://github.com/javaHelper/Kafka-for-Developers---Data-Contracts-using-Schema-Registry/assets/54174687/bcd9b9d9-fa1c-42d9-9d15-997e16b2dc0d">

<img width="1448" alt="Screenshot 2023-07-12 at 9 02 51 PM" src="https://github.com/javaHelper/Kafka-for-Developers---Data-Contracts-using-Schema-Registry/assets/54174687/d4ad9a85-14a4-4c8f-a03b-593eb65b4385">

-------

```
curl --location --request PUT 'http://localhost:8082/v1/coffee_orders/cf65290b-5c27-4958-b067-f4c53470b2d8' \
--header 'Content-Type: application/json' \
--data '{
    "orderStatus": "PROCESSING"
}'
```

<img width="763" alt="Screenshot 2023-07-12 at 9 06 17 PM" src="https://github.com/javaHelper/Kafka-for-Developers---Data-Contracts-using-Schema-Registry/assets/54174687/ab989718-5251-4a4a-b29a-07d80e85fe3c">

<img width="1371" alt="Screenshot 2023-07-12 at 9 07 44 PM" src="https://github.com/javaHelper/Kafka-for-Developers---Data-Contracts-using-Schema-Registry/assets/54174687/019957d1-ffde-4441-8675-d2407fc09801">

<img width="1069" alt="Screenshot 2023-07-12 at 9 07 12 PM" src="https://github.com/javaHelper/Kafka-for-Developers---Data-Contracts-using-Schema-Registry/assets/54174687/a29d2591-e7a2-4f50-9a75-c82bc95cbff0">

<img width="1377" alt="Screenshot 2023-07-12 at 9 07 54 PM" src="https://github.com/javaHelper/Kafka-for-Developers---Data-Contracts-using-Schema-Registry/assets/54174687/be521214-d1a3-4fa9-85fe-ef1ebcee8b0e">



