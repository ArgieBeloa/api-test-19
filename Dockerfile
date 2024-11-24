FROM ubuntu:latest AS build
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .
RUN ./target/java -jar mary-0.0.1-SNAPSHOT.jar