FROM openjdk:21
COPY target/*.jar algotrade.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "algotrade.jar"]
