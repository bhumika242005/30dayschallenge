# Use official Java base image
FROM openjdk:17

# Set working directory
WORKDIR /app

# Copy Java file to container
COPY App.java .

# Compile the Java file
RUN javac App.java

# Run the app/game
CMD ["java", "App"]

