FROM maven:3.9.6-eclipse-temurin-21-jammy AS build
COPY . /app
WORKDIR /app
RUN mvn clean package -Dskiptests
FROM eclipse-temurin:21-jre-jammy
COPY --from=build /app/target/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
