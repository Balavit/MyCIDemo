# microservices-demo-ci

This repository contains two independent Spring Boot microservices (`user-service` and `order-service`),
each built with Maven. Each service has its own `pom.xml`, tests, and Dockerfile.

GitHub Actions workflow (`.github/workflows/ci.yml`) is configured so that:
- If only `user-service` changes → only user-service builds/tests run.
- If only `order-service` changes → only order-service builds/tests run.

## Structure

- user-service/      - microservice exposing /users
- order-service/     - microservice exposing /orders
- docker-compose.yml - run both services together
- .github/workflows/ci.yml - selective build pipeline

## Quick local test

1. Build and run user-service:
   ```bash
   mvn -f user-service/pom.xml clean package
   java -jar user-service/target/user-service-0.0.1-SNAPSHOT.jar
   ```

2. Build and run order-service:
   ```bash
   mvn -f order-service/pom.xml clean package
   java -jar order-service/target/order-service-0.0.1-SNAPSHOT.jar
   ```

3. Docker build:
   ```bash
   docker build -t user-service:local ./user-service
   docker build -t order-service:local ./order-service
   ```

4. Run both:
   ```bash
   docker-compose up --build
   ```

Services will be available on:
- http://localhost:8081/users
- http://localhost:8082/orders
