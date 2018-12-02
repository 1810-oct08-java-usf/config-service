FROM openjdk:8-jdk-alpine
ADD . /config-service
WORKDIR /config-service
EXPOSE 8888
CMD ["cd /config-service && ls"]
