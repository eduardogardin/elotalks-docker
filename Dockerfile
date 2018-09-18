FROM openjdk:8-jre-alpine

MAINTAINER Eduardo Gardin <eduardoj.gardin@gmail.com>

ENV JAVA_OPTS="-Xmx64m"

ADD target/dockertalk.jar /dockertalk.jar

EXPOSE 8080
CMD echo "Starting Elotalk application ..." && java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /dockertalk.jar