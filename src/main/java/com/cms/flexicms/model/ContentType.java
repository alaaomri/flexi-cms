package com.cms.flexicms.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Document(collection = "content_types")
public class ContentType extends Auditable {
    @Id
    private String id;
    private String name;
    private String description;
    private List<Field> fields;

    @Data
    public static class Field {
        private String name;
        private FieldType type;
        private RelationType relationType;
        private boolean required;
        private Object defaultValue;
    }

    public enum FieldType {
        TEXT, NUMBER, RICHTEXT, DATE, BOOLEAN, RELATION, ASSET
    }

    public enum RelationType {
        ONE_TO_ONE, ONE_TO_MANY
    }
}


