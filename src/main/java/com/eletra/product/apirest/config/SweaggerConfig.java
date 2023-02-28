package com.eletra.product.apirest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SweaggerConfig {

    @Bean
    public Docket entityApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.eletra")) //package where all the classes are
                .paths(regex("/api.*")) // phaths to access
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        return new ApiInfo(
                "Eletra API REST",
                "API REST medidores",
                "1.0",
                "Terms of Service",
                new Contact("nadinha","Nada","nada"),
                "teste",
                "nada de novo",
                new ArrayList<VendorExtension>()
        );
    }

}
