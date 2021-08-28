# Proyecto microservicio N°2 item (microservicio cliente)

### Reference Documentation
Este proyecto obtendrá los datos del microservicio N°1 productos
Dependencias Maven:
- S B DevTools
- Spring Web

### Comunicación entre microservicios con Feing
Feing utiliza interfaces y anotaciones, es desarrollada por Netflix
* Agregar la dependencia en el proyecto
	Click derecho > Spring > Add Starters
		Spring Cloud Routing > OpenFeing


### Escalando el proyecto para balanceo de carga con Ribbon
El balanceador Ribbon selecciona la mejor disponible
* Agregar la dependencia Ribbon al proyecto
	En pom.xml > Agrega la dependencia de forma manueal, busca en https://mvnrepository.com/