FROM java:8
COPY target/config-service-0.0.1-SNAPSHOT.jar /tmp/config-service-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "/tmp/config-service-0.0.1-SNAPSHOT.jar","--server.servlet.context-path=/rpm-config","&"]
#ADD .
