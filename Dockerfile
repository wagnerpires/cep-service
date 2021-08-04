FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD ./target/servicecep-wrtecnologia-0.0.1-SNAPSHOT.jar servicecep-wrtecnologia.jar
ENTRYPOINT ["java","-jar","/servicecep-wrtecnologia.jar"]