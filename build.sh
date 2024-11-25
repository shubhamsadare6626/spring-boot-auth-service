git pull origin main && \
mvn spring-boot.run  && \
docker-compose down && \
docker build -t personal/spring-auth-service . && \
docker image prune -f && docker-compose up -d && \
docker logs -f spring-auth-service

