To run the docker container: 
docker container run -p 8081:8081 -d vitorrmorais/quotationmanagement:0.0.1-SNAPSHOT

--
Endpoint: http://localhost:8081/create

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
Endpoint: http://localhost:8081/read

Payload example:
{
 "stockId": "petr3"
}

---
Endpoint: http://localhost:8081/readAll

Payload example:
{
}