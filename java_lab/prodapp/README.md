# prodapp

간단한 **상품(Product) CRUD**를 연습하기 위한 **소켓 기반(Java) 클라이언트/서버 프로그램**입니다.  
클라이언트가 입력한 명령을 `RequestDTO` 형태로 **JSON(Gson)** 으로 직렬화해 서버로 전송하면, 서버가 요청을 처리하고 `ResponseDTO`(JSON)로 응답합니다.  
서버의 데이터 저장소는 **MySQL**(`productdb` DB)의 `product` 테이블을 사용합니다.

## 구성

- **client**
  - `client/MyClient.java`: 콘솔 입력을 받아 서버(20000 포트)에 JSON 요청을 전송
- **server**
  - `server/MyServer.java`: 20000 포트에서 대기, 요청 JSON을 파싱해 상품 서비스 호출 후 응답 JSON 전송
  - `server/ProductService.java`: 상품 등록/목록/상세/삭제 비즈니스 로직
  - `server/ProductRepository.java`: JDBC로 MySQL `product` 테이블 CRUD
  - `server/DBConnection.java`: DB 연결 생성(DriverManager)
- **dto**
  - `dto/RequestDTO.java`: `method`, `querystring`, `body`를 담는 요청 DTO
  - `dto/ResponseDTO.java`: `msg`, `body`를 담는 응답 DTO

## 동작 방식(요약)

- **통신**: TCP Socket + 줄바꿈(`\n`) 단위로 메시지 송수신
- **요청 포맷**: `RequestDTO`를 JSON으로 전송
  - `method`: `"get" | "post" | "delete"`
  - `querystring`: 예) `{ "id": 1 }`
  - `body`: 예) `{ "name": "pen", "price": 1000, "qty": 3 }`
- **응답 포맷**: `ResponseDTO<T>`를 JSON으로 전송
  - `msg`: `"ok"` 또는 오류 메시지
  - `body`: 상품 1건(`Product`) 또는 상품 목록(`List<Product>`) 또는 `null`

## DB 준비(MySQL)

서버는 기본적으로 아래 설정으로 접속합니다(`server/DBConnection.java`).

- URL: `jdbc:mysql://localhost:3306/productdb`
- User: `root`
- Password: `bitc5600!`

예시 테이블:

```sql
create database if not exists productdb;
use productdb;

create table if not exists product (
  id int auto_increment primary key,
  name varchar(255) not null,
  price int not null,
  qty int not null
);
```

## 실행 방법

1) 서버 실행:
- `server.MyServer` 실행 (포트 **20000** 대기)

2) 클라이언트 실행:
- `client.MyClient` 실행 후 콘솔에서 명령 입력

## 클라이언트 입력 예시

- **목록 조회**
  - `get`
- **상세 조회**
  - `get 1`
- **상품 등록**
  - `post pen 1000 3`
- **상품 삭제**
  - `delete 1`
- **종료**
  - `exit`

## 의존성

- MySQL JDBC: `mysql:mysql-connector-java`
- JSON: `com.google.code.gson:gson`


