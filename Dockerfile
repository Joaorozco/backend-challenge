FROM amazoncorretto:17-alpine-jdk
MAINTAINER JoaquinOrozco
COPY target/demo-0.0.1-SNAPSHOT 
ENTRYPOINT  ["java", "-jar", "/challenge-full-stack.jar"]