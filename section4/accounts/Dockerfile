# Start with a base image containing Java runtime.
FROM openjdk:17-jdk-slim

# Information about who maintains this Docker image
MAINTAINER rndayala.com

# Add the application's JAR file to the Docker image root folder
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Execute the application
ENTRYPOINT["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]