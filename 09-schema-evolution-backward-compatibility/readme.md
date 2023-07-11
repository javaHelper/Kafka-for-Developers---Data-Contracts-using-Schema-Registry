# Data Evolution using Schema Registry

# Backward Compatibility

Let's follow the steps given in this section :

1. Let's make sure version 1.0 has store field in it
2. Delete the store field and update the version in the schemas module to 2.0, and publish a 2.0 to our local maven repo.
 - gradle
    - Execute clean gradle task
    - Execute the generateAvro gradle task
    - Execute publishToMavenLocal gradle task
 - maven
   - Execute clean task
   - Execute install task
3. Update the consumer to use schemas module 2.0 version
4. publish the coffee-order record still with version 1.0
   - Consumer using 2.0 version should consume fine without any issues
5. Update the producer to use schemas module 2.0 version
6. publish the coffee-order record with schemas module 2.0 version
   - Consumer should consume fine without any issues
7. The subject in coffee-orders-sr-value should have a newer version 2.0
   - Only the producer can create newer versions in Schema Registry.

```
00:23:43.689 [main] INFO  c.l.c.CoffeeOrderConsumerSchemaRegistry - Consumed Message , key : {"id": 548} , value : {"id": {"id": 548}, "name": "Linnie Rath", "nickName": "", "orderLineItems": [{"name": "Caffe Latte", "size": "MEDIUM", "quantity": 1, "cost": 3.99}], "ordered_time": "2023-07-11T18:53:42.969Z", "ordered_date": "2023-07-12", "status": "NEW"}
00:23:43.705 [main] INFO  c.l.c.CoffeeOrderConsumerSchemaRegistry - utcDateTime: 2023-07-11T18:53:42.969 , cstDateTime : 2023-07-11T13:53:42.969 
```