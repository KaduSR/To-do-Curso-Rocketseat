# Stage 1: Build the application
FROM openjdk:17-jdk-slim AS build
WORKDIR /app
COPY . .
RUN chmod +x ./mvnw
RUN ./mvnw clean install

# Stage 2: Create the final image
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /app/target/todolist-1.0.0.jar ./app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
