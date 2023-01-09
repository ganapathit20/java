FROM openjdk:8
EXPOSE 8000
COPY target/spring-boot.jar /app.jar
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]