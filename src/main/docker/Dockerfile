FROM frolvlad/alpine-oraclejdk8:slim

MAINTAINER yvillalonsilva@gmail.com

ADD api-recursos-1.0.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
