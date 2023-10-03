FROM maven:3.8.5-openjdk-17 AS build
MAINTAINER JoaquinOrozco
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
MAINTAINER JoaquinOrozco
COPY --from=build /target/demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT  ["java", "-jar", "/demo.jar"]