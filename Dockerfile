FROM amazoncorretto:17-alpine-jdk
MAINTAINER JoaquinOrozco
COPY target/demo.jar challenge-full-stack.jar
ENTRYPOINT  ["java", "-jar", "/challenge-full-stack.jar"]