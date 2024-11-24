<<<<<<< HEAD
# Use the official Maven image to build the project
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app

# Copy the project files
COPY . .

# Build the application
RUN mvn clean package -DskipTests

# Use the official OpenJDK image for the runtime environment
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the built jar file
COPY --from=build /app/target/your-app-name.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

>>>>>>> bd0937e1125429da47d5d298d5662bc1566b09fc
