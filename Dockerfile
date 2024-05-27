FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY /target/deploy_aws-0.0.1.jar deploy_aws-0.0.1.jar
EXPOSE 8080
CMD ["java", "-jar", "deploy_aws-0.0.1.jar"]