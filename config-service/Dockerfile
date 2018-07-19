FROM avinb/jdk8-64:latest
MAINTAINER Danilo Rodrigues

ADD ./config-service/target/config.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config.jar"]

EXPOSE 9090