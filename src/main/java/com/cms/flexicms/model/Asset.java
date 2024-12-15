package com.cms.flexicms.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(collection = "assets")
public class Asset extends Auditable {
    @Id
    private String id;
    private String url; // URL to access the asset
    private String fileName;
    private String mimeType;
    private long size; // File size in bytes
    private Map<String, String> metadata; // Optional metadata (e.g., tags, dimensions)
    private Instant uploadedAt;
    private String uploadedBy;
}

