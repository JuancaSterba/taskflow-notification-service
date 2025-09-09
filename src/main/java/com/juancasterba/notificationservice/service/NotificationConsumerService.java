package com.juancasterba.notificationservice.service;

import com.juancasterba.notificationservice.dto.events.TaskEventDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationConsumerService {

    @KafkaListener(topics = "tasks-events", groupId = "notification_group")
    public void handleTaskCreationEvent(TaskEventDTO event) {
        // Log con un formato más profesional y estructurado
        log.info("🔔 Notificación recibida para la tarea '{}' (ID: {}).", event.getTaskTitle(), event.getTaskId());
        log.info("   -> Simulando envío de email de notificación a <{}>.", event.getOwnerEmail());

        // Aquí, en un futuro, iría la lógica real para:
        // 1. Formatear una plantilla de email (HTML) con los datos del evento.
        // 2. Usar un servicio de correo (como JavaMailSender de Spring o una API de terceros como SendGrid) para enviar el email.

        log.info("   -> ✅ Simulación de envío completada.");
    }
}