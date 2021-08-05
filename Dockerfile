FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD ./target/cepservice-wrtecnologia-0.0.1-SNAPSHOT.jar cepservice-wrtecnologia.jar
ENTRYPOINT ["java","-jar","/cepservice-wrtecnologia.jar"]