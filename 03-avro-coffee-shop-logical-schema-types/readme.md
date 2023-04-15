#

![WhatsApp Image 2023-04-08 at 14 08 15](https://user-images.githubusercontent.com/54174687/232185260-5fa985de-6f9f-466f-8add-5d20ff0687e8.jpeg)

![WhatsApp Image 2023-04-14 at 12 54 02](https://user-images.githubusercontent.com/54174687/232185263-9c7b0749-8bdc-403e-b96f-3925a9104dea.jpeg)

```
10:42:38.928 [main] INFO  o.a.k.c.c.i.ConsumerCoordinator - [Consumer clientId=consumer-coffee.consumer-1, groupId=coffee.consumer] Found no committed offset for partition coffee-orders-0
10:42:38.948 [main] INFO  o.a.k.c.c.i.SubscriptionState - [Consumer clientId=consumer-coffee.consumer-1, groupId=coffee.consumer] Resetting offset for partition coffee-orders-0 to position FetchPosition{offset=0, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[localhost:9092 (id: 0 rack: null)], epoch=0}}.
10:42:54.443 [main] INFO  c.l.consumer.CoffeeOrderConsumer - Consumed Message , key : null , value : {"id": 674, "name": "Mrs. Lakeisha Ryan", "nickName": "", "store": {"id": 126, "address": {"addressLine1": "Suite 762 4444 Mario Trace, South Reachester, TN 13933", "city": "South Gaye", "state_province": "North Carolina", "country": "USA", "zip": "89960-9085"}}, "orderLineItems": [{"name": "Caffe Latte", "size": "MEDIUM", "quantity": 1}], "status": "NEW"}
10:51:38.738 [main] INFO  o.apache.kafka.clients.NetworkClient - [Consumer clientId=consumer-coffee.consumer-1, groupId=coffee.consumer] Node -1 disconnected.
```
