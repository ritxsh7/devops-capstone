FROM eclipse-temurin:21
WORKDIR workspace
ARG JAR_FILE=target/simple-app-demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT java -jar app.jar
