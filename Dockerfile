FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/mary-0.0.1-SNAPSHOT.jar.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080
