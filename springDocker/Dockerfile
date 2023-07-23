FROM openjdk:17
EXPOSE 8080
ADD target/spring-docker.jar docker-example.jar 
ENTRYPOINT [ "java","-jar","docker-example.jar"]