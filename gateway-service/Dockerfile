FROM avinb/jdk8-64:latest
MAINTAINER Danilo Rodrigues

ADD ./gateway-service/target/gateway.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/gateway.jar"]

EXPOSE 8080