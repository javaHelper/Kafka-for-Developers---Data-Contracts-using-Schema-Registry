#

```
18:44:04.446 [main] INFO  o.a.k.c.c.i.SubscriptionState - [Consumer clientId=consumer-coffee.logical.schema.consumer-1, groupId=coffee.logical.schema.consumer] Resetting offset for partition coffee-orders-0 to position FetchPosition{offset=0, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[localhost:9092 (id: 0 rack: null)], epoch=0}}.
18:44:19.077 [main] INFO  c.l.consumer.CoffeeOrderConsumer - ## Consumed Message , key : null , value : {"id": 144, "name": "Jacob Lockman", "nickName": "", "store": {"id": 102, "address": {"addressLine1": "Apt. 352 5424 Reginia Ford, Miland, TX 83793-2586", "city": "Swaniawskihaven", "state_province": "Oklahoma", "country": "USA", "zip": "67873"}}, "orderLineItems": [{"name": "Caffe Latte", "size": "MEDIUM", "quantity": 1, "cost": 3.99}], "ordered_time": "2023-04-17T13:14:18.566Z", "status": "NEW"}
18:44:19.092 [main] INFO  c.l.consumer.CoffeeOrderConsumer - ## utcDateTime : 2023-04-17T13:14:18.566, cstDateTime : 2023-04-17T08:14:18.566

```
