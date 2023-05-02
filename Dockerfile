FROM amazoncorretto:17-alpine-jdk
MAINTAINER JoaquinOrozco
COPY out/artifacts/demo_jar/demo.jar challenge-full-stack.jar
ENTRYPOINT  ["java", "-jar", "/challenge-full-stack.jar"]