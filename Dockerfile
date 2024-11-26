# Use a base image with OpenJDK
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the application's JAR file into the container
COPY target/calc-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application will run on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]
