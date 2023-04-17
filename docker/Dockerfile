#FROM openjdk:11
#ADD target/shoppingcart.jar shoppingcart.jar
#ENTRYPOINT ["java", "-jar","blog-api-docker.jar"]
#EXPOSE 8080

FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8082
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ADD target/shoppingcart-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar"]