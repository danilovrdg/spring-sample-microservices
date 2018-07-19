FROM avinb/jdk8-64:latest
MAINTAINER Danilo Rodrigues

ADD ./discovery-service/target/discovery.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/discovery.jar"]

EXPOSE 9091