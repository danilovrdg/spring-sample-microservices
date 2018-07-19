FROM avinb/jdk8-64:latest
MAINTAINER Danilo Rodrigues

ADD ./account-service/target/account.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/account.jar"]

EXPOSE 8081