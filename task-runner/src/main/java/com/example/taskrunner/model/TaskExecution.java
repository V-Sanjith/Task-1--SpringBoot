package com.example.taskrunner.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "task_executions")
public class TaskExecution {
    @Id
    private String id;
    private String taskId;
    private String executedBy;
    private String result;
    private long timestamp;
}
