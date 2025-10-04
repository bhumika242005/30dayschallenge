# Use official Java base image
FROM openjdk:17

# Set working directory
WORKDIR /app

# Copy Java file to container
COPY GuessGame.java .

# Compile the Java file
RUN javac GuessGame.java

# Run the app/game
CMD ["java", "GuessGame"]

