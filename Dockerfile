FROM openjdk:8
MAINTAINER Arya Vardhan aryav709@gmail.com
COPY ./target/scientific_calc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "scientific_calc-1.0-SNAPSHOT-jar-with-dependencies.jar", "scientific_calc.My_Main"]
