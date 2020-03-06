package com.qinsw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("Sebastian", "https://www.raspberrypi.org/", "2573992956@qq.com");
        return new ApiInfo("Sebastian's api document", "FUN SWAGGER", "1.1",
                "http://www.baidu.com", contact, "Apache 2.0",
                "http://www.bing.com", new ArrayList());
    }
}
