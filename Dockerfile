FROM openjdk:8-jdk-alpine
EXPOSE 8080
COPY target/spring-docker-demo-*.jar spring-docker-demo.jar
ENTRYPOINT ["java","-jar","spring-docker-demo.jar"]