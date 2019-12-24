#!/bin/bash
cd /media/pablo/DATOS/CURSOS_UDEMY/SPRING_MICROSERVICES/producto-service
mvn clean package 
nohup java -jar target/springboot_servicio_produtos-0.0.1-SNAPSHOT.jar -b 0.0.0.0 --server.port=9001 > /dev/null &

# nohup java -jar target/producto-service-0.0.1-SNAPSHOT.jar -b 0.0.0.0 > /dev/null &

cd /media/pablo/DATOS/CURSOS_UDEMY/SPRING_MICROSERVICES/springboot_servicio_item
mvn clean package
nohup java -jar target/producto-service-0.0.1-SNAPSHOT.jar -b 0.0.0.0:8001 > /dev/null &
