FROM amazoncorretto:17-alpine-jdk
MAINTAINER JoaquinOrozco
COPY target/demo-0.0.1-SNAPSHOT challenge-full-stack.demo.jar
ENTRYPOINT  ["java", "-jar", "/challenge-full-stack.jar"]