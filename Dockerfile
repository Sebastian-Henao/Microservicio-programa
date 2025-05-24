FROM openjdk:23
LABEL authors="sebastianhenaogamboa"
WORKDIR /app
COPY target/programa-service-0.0.1-SNAPSHOT.jar /app
ENTRYPOINT ["java", "-jar", "programa-service-0.0.1-SNAPSHOT.jar"]
