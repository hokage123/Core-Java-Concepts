From openjdk:17
Expose 8080
ADD target/dockerapp.jar dockerapp.jar
ENTRYPOINT ["java", "-jar", "/dockerapp.jar"]