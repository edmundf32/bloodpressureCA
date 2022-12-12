FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/bloodpressure.jar
ADD ${JAR_FILE} bloodpressure.jar
ENTRYPOINT ["java","-jar","/bloodpressure.jar"]
