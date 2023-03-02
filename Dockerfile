FROM openjdk:8
EXPOSE 8080
ADD target/morgans-workflow-pipeline.jar morgans-workflow-pipeline.jar
ENTRYPOINT["java", "-jar", "/morgans-workflow-pipeline.jar"]