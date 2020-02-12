FROM openjdk:8
ADD target/spring-boot-on-docker.war spring-boot-on-docker.war
EXPOSE 9939
ENTRYPOINT ["java", "-jar", "spring-boot-on-docker.war"]