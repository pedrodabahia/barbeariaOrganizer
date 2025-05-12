# Etapa 1: build da aplicação
FROM maven:3.9.4-eclipse-temurin-17 as builder

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

# Etapa 2: imagem final
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copia o .jar gerado na etapa anterior
COPY --from=builder /app/target/barbearia-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
