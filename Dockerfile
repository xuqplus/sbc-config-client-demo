FROM alpine:3.5

COPY target/*.jar /app.jar

RUN apk --update add openjdk8-jre bash

EXPOSE 8080

CMD java -jar app.jar

ENV SBC_CONFIG_SERVER_DEMO sbc-config-server-demo