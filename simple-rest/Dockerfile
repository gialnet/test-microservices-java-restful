FROM openjdk:8-jre-alpine
COPY ./target/simple-rest-0.0.1-SNAPSHOT.jar /usr/src/eureka/
WORKDIR /usr/src/eureka
EXPOSE 8080-8080
CMD ["java", "-jar", "simple-rest-0.0.1-SNAPSHOT.jar"]