FROM openjdk:19-jdk
VOLUME /tmp
COPY target/ChatGPT-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]