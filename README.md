## 스프링 부트 멀티 모듈 프로젝트

### 🛠️ 사용된 환경
- Intellij Ultimate
- Spring Boot 3.2.0
- Azul JDK 17.0.9

### 📝 문서
- [노션](https://storm-jellyfish-db2.notion.site/Spring-Multimodule-0e0fffe346e14594bd91e5581059266b?pvs=4)

### ▶️ 실행 결과
```
### WEB Module의 루트 경로 호출
GET http://localhost:8080

HTTP/1.1 200 
Content-Type: text/plain;charset=UTF-8
Content-Length: 3
Date: Sun, 26 Nov 2023 03:54:14 GMT
Keep-Alive: timeout=60
Connection: keep-alive

WEB

Response code: 200; Time: 3ms (3 ms); Content length: 3 bytes (3 B)
```

```
### ADMIN Module의 루트 경로 호출
GET http://localhost:8081

HTTP/1.1 200 
Content-Type: text/plain;charset=UTF-8
Content-Length: 5
Date: Sun, 26 Nov 2023 03:54:58 GMT
Keep-Alive: timeout=60
Connection: keep-alive

ADMIN

Response code: 200; Time: 3ms (3 ms); Content length: 5 bytes (5 B)
```

```
### WEB Module의 member 경로 호출
GET http://localhost:8080/member

HTTP/1.1 200 
Content-Type: application/json
Transfer-Encoding: chunked
Date: Sun, 26 Nov 2023 03:55:18 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
  "userType": "WEB USER",
  "serverType": "WEB"
}
Response file saved.
> 2023-11-26T125518.200.json

Response code: 200; Time: 2ms (2 ms); Content length: 42 bytes (42 B)
```

```
### ADMIN Module의 member 경로 호출
GET http://localhost:8081/member

HTTP/1.1 200 
Content-Type: application/json
Transfer-Encoding: chunked
Date: Sun, 26 Nov 2023 03:55:29 GMT
Keep-Alive: timeout=60
Connection: keep-alive

{
  "userType": "ADMIN USER",
  "serverType": "ADMIN"
}
Response file saved.
> 2023-11-26T125529.200.json

Response code: 200; Time: 3ms (3 ms); Content length: 46 bytes (46 B)
```