package com.cms.flexicms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoAuditing
@EnableMongoRepositories(basePackages = "com.cms.flexicms.repository") // Point to your repository package

public class FlexiCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlexiCmsApplication.class, args);
    }

}
