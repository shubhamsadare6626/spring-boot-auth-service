FROM openjdk:17-jdk-alpine
RUN apk add --no-cache tzdata
ENV TZ=Asia/Kolkata

COPY target/spring-boot-auth-service-1.0.0.jar /app.jar
COPY src/main/resources/application.yml /application.yml
ENTRYPOINT exec java -server -Xmx256m -Xss1024k -Djava.security.egd=file:/dev/./urandom -jar /app.jar

