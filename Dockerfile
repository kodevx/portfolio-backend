FROM eclipse-temurin:21-jre

EXPOSE 10000

ADD target/*.jar portfolio-rohith-image.jar

ENTRYPOINT ["java","-jar","/portfolio-rohith-image.jar"]