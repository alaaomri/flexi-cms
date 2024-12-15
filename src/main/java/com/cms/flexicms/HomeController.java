package com.cms.flexicms;

import com.cms.flexicms.model.ContentType;
import com.cms.flexicms.repository.ContentTypeRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    private final ContentTypeRepository contentTypeRepository;

    public HomeController(ContentTypeRepository contentTypeRepository) {
        this.contentTypeRepository = contentTypeRepository;
    }

    @PostMapping
    public String home() {
        ContentType contentType = new ContentType();
        contentType.setName("News");
        contentTypeRepository.save(contentType);
        return "Welcome to FlexiCMS";
    }
}
