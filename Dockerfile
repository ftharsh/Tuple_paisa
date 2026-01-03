FROM eclipse-temurin:23-jdk

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/*.jar"]
