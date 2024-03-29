FROM openjdk:20-jdk

WORKDIR /home/save
COPY ./build/libs/*.jar app.jar

EXPOSE 8080

CMD java -jar app.jar
