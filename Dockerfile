FROM amazoncorretto:21-alpine
ENTRYPOINT ["/usr/bin/artist-service.sh"]

COPY artist-service.sh /usr/bin/artist-service.sh
COPY target/*.jar /usr/share/artist-service/artist-service.jar
