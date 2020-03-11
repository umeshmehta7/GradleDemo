FROM adoptopenjdk/openjdk11:alpine-jre
MAINTAINER matchesfashion.com
WORKDIR /opt/app
COPY build/libs/*.jar app.jar
EXPOSE 8083
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
