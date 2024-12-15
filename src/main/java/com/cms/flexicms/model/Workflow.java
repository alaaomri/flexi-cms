package com.cms.flexicms.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(collection = "workflows")
public class Workflow extends Auditable {
    @Id
    private String id;
    private String name;  // e.g., "Default Workflow"
    private List<WorkflowStep> steps;

    @Data
    public static class WorkflowStep {
        private String name;  // e.g., "Draft", "Review", "Published"
        private String role;  // Role required to approve this step (e.g., "Editor", "Admin")
        private int sequence; // Order of steps
    }
}

