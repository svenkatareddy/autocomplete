FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} autocomplete.jar
ENTRYPOINT ["java","-jar","/autocomplete.jar"]