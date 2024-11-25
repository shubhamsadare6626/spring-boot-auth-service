git pull origin main && \
mvn clean install -DskipTests=true && \
docker-compose down && \
docker build -t personal/spring-boot-auth-service . && \
docker image prune -f && docker-compose up -d && \
docker logs -f spring-boot-auth-service
