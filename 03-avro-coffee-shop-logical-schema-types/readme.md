#
<img width="1365" alt="Screenshot 2023-04-15 at 10 52 07 AM" src="https://user-images.githubusercontent.com/54174687/232185288-36e1b280-4478-481f-b13b-02a9e1001bf4.png">

<img width="1365" alt="Screenshot 2023-04-15 at 10 52 18 AM" src="https://user-images.githubusercontent.com/54174687/232185312-f5681fdc-d6f0-426a-a649-7e679b25c67b.png">


```
10:42:38.928 [main] INFO  o.a.k.c.c.i.ConsumerCoordinator - [Consumer clientId=consumer-coffee.consumer-1, groupId=coffee.consumer] Found no committed offset for partition coffee-orders-0
10:42:38.948 [main] INFO  o.a.k.c.c.i.SubscriptionState - [Consumer clientId=consumer-coffee.consumer-1, groupId=coffee.consumer] Resetting offset for partition coffee-orders-0 to position FetchPosition{offset=0, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[localhost:9092 (id: 0 rack: null)], epoch=0}}.
10:42:54.443 [main] INFO  c.l.consumer.CoffeeOrderConsumer - Consumed Message , key : null , value : {"id": 674, "name": "Mrs. Lakeisha Ryan", "nickName": "", "store": {"id": 126, "address": {"addressLine1": "Suite 762 4444 Mario Trace, South Reachester, TN 13933", "city": "South Gaye", "state_province": "North Carolina", "country": "USA", "zip": "89960-9085"}}, "orderLineItems": [{"name": "Caffe Latte", "size": "MEDIUM", "quantity": 1}], "status": "NEW"}
10:51:38.738 [main] INFO  o.apache.kafka.clients.NetworkClient - [Consumer clientId=consumer-coffee.consumer-1, groupId=coffee.consumer] Node -1 disconnected.
```
