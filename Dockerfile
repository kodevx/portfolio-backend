FROM eclipse-temurin:21-jre

EXPOSE 10000

ADD target/*.jar portfolio-back-end.jar

ENTRYPOINT ["java","-jar","/portfolio-back-end.jar"]