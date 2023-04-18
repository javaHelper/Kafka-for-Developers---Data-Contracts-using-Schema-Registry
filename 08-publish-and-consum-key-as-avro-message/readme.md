# 

```
18:58:51.445 [main] INFO  o.a.k.c.c.i.SubscriptionState - [Consumer clientId=consumer-coffee.consumer.sr-1, groupId=coffee.consumer.sr] Resetting offset for partition coffee-orders-sr-0 to position FetchPosition{offset=1, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[localhost:9092 (id: 0 rack: null)], epoch=0}}.
18:59:09.212 [main] INFO  c.l.c.CoffeeOrderConsumerSchemaRegistry - Consumed Message , key : null , value : {"id": 23a8372e-f06d-4c7c-b120-bda37bda6ffb, "name": "Sona Nicolas", "nickName": "", "store": {"id": 592, "address": {"addressLine1": "97016 Candie Locks, North Eve, ID 74686-1888", "city": "Lake Casey", "state_province": "Massachusetts", "country": "USA", "zip": "23593"}}, "orderLineItems": [{"name": "Caffe Latte", "size": "MEDIUM", "quantity": 1, "cost": 3.99}], "ordered_time": "2023-04-18T13:29:08.349Z", "ordered_date": "2023-04-18", "status": "NEW"}
18:59:09.227 [main] INFO  c.l.c.CoffeeOrderConsumerSchemaRegistry - utcDateTime: 2023-04-18T13:29:08.349 , cstDateTime : 2023-04-18T08:29:08.349 
```
