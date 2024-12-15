package com.cms.flexicms.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.List;
import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(collection = "content_entries")
public class ContentEntry extends Auditable {
    @Id
    private String id;
    private String contentTypeId;  // Reference to ContentType
    private Map<String, Object> fields; // Dynamic content fields as key-value pairs
    private String workflowState; // e.g., "Draft", "Review", "Published"
    private List<ContentVersion> versions;

    @Data
    public static class ContentVersion {
        private String versionId;
        private Map<String, Object> fields; // Snapshot of fields in this version
        private String changeDescription;
        private Instant versionedAt;
        private String versionedBy;
    }
}

