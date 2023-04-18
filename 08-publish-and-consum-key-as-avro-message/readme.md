# 

```
23:06:34.095 [main] INFO  o.a.k.c.c.i.SubscriptionState - [Consumer clientId=consumer-coffee.consumer.sr-1, groupId=coffee.consumer.sr] Resetting offset for partition coffee-orders-sr-0 to position FetchPosition{offset=0, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[localhost:9092 (id: 0 rack: null)], epoch=0}}.
23:06:45.116 [main] INFO  c.l.c.CoffeeOrderConsumerSchemaRegistry - Consumed Message , key : {"id": 400} , value : {"id": {"id": 400}, "name": "Raphael Stoltenberg", "nickName": "", "store": {"id": 184, "address": {"addressLine1": "7876 Walsh Creek, Zaidastad, OK 49301-9735", "city": "Port Kourtneyland", "state_province": "Minnesota", "country": "USA", "zip": "29283-2867"}}, "orderLineItems": [{"name": "Caffe Latte", "size": "MEDIUM", "quantity": 1, "cost": 3.99}], "ordered_time": "2023-04-18T17:36:44.073Z", "ordered_date": "2023-04-18", "status": "NEW"}
23:06:45.136 [main] INFO  c.l.c.CoffeeOrderConsumerSchemaRegistry - utcDateTime: 2023-04-18T17:36:44.073 , cstDateTime : 2023-04-18T12:36:44.073 
```
