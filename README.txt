Service: http://localhost:8081/record

Payload example:
{
 "id": "c01cede4-cd45-11eb-b8bc-0242ac30003",
 "stockId": "petr3",
 "quotes": [
 { 
     "dateQt": "2019-01-01",
     "valueQt": "10"
 },
 { 
     "dateQt": "2019-01-02",
     "valueQt": "11"
 },
 { 
     "dateQt": "2019-01-03",
     "valueQt": "14"
 }

 ]
}

---
Service: http://localhost:8081/read

Payload example:
{
 "stockId": "petr3"
}

---
Service: http://localhost:8081/readAll

Payload example:
{
}