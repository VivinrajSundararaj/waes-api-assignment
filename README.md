# waes-assignment

Rest Api Services for WAES Interview Assignment "Scalable Web"

This project can be tested by only starting the rest services, is using some of the latest tools like Spring Boot 2.0, Swagger and MongoDB(Embedded), thinking about scalability this project can be updated by configuration to upgrade or change dependencies or capabilities in less time

Usage
======
* Run WaesApiAssignmentApplication class using Java application to Start the SpringBoot Service
* Call "left" endpoint with `http://localhost:<port>/v1/diff/<id>/left` i.e `http://localhost:8080/v1/diff/01/left`
* Call "right" endpoint with `http://localhost:<port>/v1/diff/<id>/right` i.e `http://localhost:8080/v1/diff/01/right`
* Call "diff" endpoint with `http://localhost:<port>/v1/diff/<id>` i.e `http://localhost:8080/v1/diff/01`

Rest Service Endpoint's Basic Configuration
======

* Change port: update property port inside `application.yml` (default : 8080)
* This Spring Boot which exposes the rest api has configured an embedded MongoDB for portability and Plug and Play style.

Integration Tests
======
* Integration tests included to test all the endpoints

Swagger
======
* For Rest Api end points, the api documentation and testing can be done using swagger in Browser by accessing http://localhost:8080/swagger-ui.html
