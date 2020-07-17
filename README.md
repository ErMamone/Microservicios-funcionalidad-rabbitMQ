# Microservicios-funcionalidad-rabbitMQ


Curso de microservicios realizado con el instructor Andres Jose Guzman



Se utilizan tecnologias como Spring boot 2 y Spring Cloud.

Uso de Eureka y zuul server.

conexion para consumo otro servicios con Feign y RestTemplate.

balanceo de carga con Ribbon y catch de errores y fallos con Hystrix.

Spring cloud security (Oauth y JWT token).

Se utiliza carga de configuraciones con Spring cloud config server.

trazabilidad con spring cloud sleuth y zipkin + RabbitMQ (no funcional por problemas de versionado).


utilizacion de base de datos MySQL8 y PostgreSQL.

CRUD manejable a partir de Postman.



Zuul puerto:

localhost:8090/api/servicio/tipo-de-consulta

ejemplo: POST localhost:8090/api/security/oauth/token (agregando datos correspondientes)


configuracion alojada en otro repositorio

autoconfiguracion de puertos para servicios
