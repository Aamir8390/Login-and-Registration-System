# Use an official Java runtime as the base image
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy your built Spring Boot jar to the container
COPY target/LoginAndRegistration-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot app runs on (change as needed)
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
