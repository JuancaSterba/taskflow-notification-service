package com.juancasterba.notificationservice.dto.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskEventDTO {
    private Long taskId;
    private String taskTitle;
    private Long projectId;
    private String projectName;
    private String ownerUsername;
    private String ownerEmail;
}
