package com.cms.flexicms.repository;

import com.cms.flexicms.model.ContentType;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContentTypeRepository extends MongoRepository<ContentType, String> {
    // Custom query methods if needed
}

