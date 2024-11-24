<<<<<<< HEAD
FROM ubuntu:latest AS build
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .
RUN ./target/java -jar mary-0.0.1-SNAPSHOT.jar
=======

FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
 COPY --from=build /target/mary-0.0.1-SNAPSHOT.jar demo.jar
 EXPOSE 8080
 ENTRYPOINT ["java", "-jar", "demo.jar"]
>>>>>>> bd0937e1125429da47d5d298d5662bc1566b09fc
