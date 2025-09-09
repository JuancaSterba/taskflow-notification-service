# TaskFlow Notification Service

Microservicio dedicado a escuchar eventos del ecosistema TaskFlow y gestionar el envío de notificaciones a los usuarios.

## Tecnologías Utilizadas

* **Lenguaje:** Java 17
* **Framework:** Spring Boot 3
* **Mensajería:** Spring for Apache Kafka
* **Gestión de Dependencias:** Maven

## Funcionamiento

Este servicio actúa como un **Consumidor de Kafka**. Su principal responsabilidad es:

1.  **Escuchar el Topic:** Se suscribe al topic de Kafka `tasks-events`.
2.  **Procesar Eventos:** Cuando la API principal (`taskflow-api`) publica un evento (ej: `TaskEventDTO`), este servicio lo recibe.
3.  **Ejecutar Acciones:** Al recibir un evento, dispara la lógica de negocio correspondiente (actualmente, simula el envío de un email de notificación).

## Configuración del Entorno

1.  **Configuración de Kafka:**
    * En `src/main/resources`, copia `application-example.properties` y renómbralo a `application.properties` (o `.yml`).
    * Asegúrate de que la propiedad `spring.kafka.bootstrap-servers` apunta a tu instancia de Kafka.

2.  **DTOs de Eventos:**
    * Este servicio debe tener las mismas definiciones de clases de DTOs de eventos que el servicio productor para poder deserializar los mensajes correctamente.

## Cómo Ejecutar el Proyecto Localmente

1.  Asegúrate de que el ecosistema de Docker (PostgreSQL, Kafka, etc.) esté corriendo.
2.  Inicia la aplicación principal `taskflow-api`.
3.  Inicia esta aplicación (`notification-service`).