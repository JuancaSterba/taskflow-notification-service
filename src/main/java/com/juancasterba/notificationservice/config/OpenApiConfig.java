package com.juancasterba.notificationservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Notification Service API",
                version = "1.0.0",
                description = """
                        The Notification Service is a key component of the TaskFlow ecosystem, responsible for handling and dispatching notifications.
                        This service operates asynchronously, consuming events from a Kafka topic to send notifications to users.

                        ### Key Features:
                        - **Event-Driven**: Reacts to events from the `tasks-events` topic.
                        - **Asynchronous Processing**: Ensures that notification delivery does not block other services.

                        ### Interaction Model:
                        This service does not expose any synchronous REST endpoints. All interactions are handled through Kafka messages.
                        To trigger a notification, a message must be published to the `tasks-events` topic.
                        """
        ),
        servers = {
                @Server(url = "${spring.kafka.bootstrap-servers}", description = "Kafka Bootstrap Server")
        }
)
public class OpenApiConfig {
}
