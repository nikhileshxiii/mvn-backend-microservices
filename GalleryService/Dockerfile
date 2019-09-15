FROM openjdk:11
EXPOSE 8100
VOLUME /tmp
ARG JAR_FILE=target/GalleryService-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
