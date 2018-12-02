FROM openjdk:8-jdk-alpine
ADD . /config-service
WORKDIR /config-service
EXPOSE 8888
CMD ["java", "-jar", "/config-service/target/config-service-0.0.1-SNAPSHOT.jar"]
