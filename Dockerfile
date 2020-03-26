FROM java:8-jdk-alpine

ADD  /target/MyApp-1.0-SNAPSHOT-jar-with-dependencies.jar /appli.jar

CMD ["java","-jar","/appli.jar"]