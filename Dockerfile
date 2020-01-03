FROM com.sunjin.vip/vip/java:1.8
MAINTAINER SUNJIN
COPY boot-docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java" ,"-jar" ,"app.jar"]

