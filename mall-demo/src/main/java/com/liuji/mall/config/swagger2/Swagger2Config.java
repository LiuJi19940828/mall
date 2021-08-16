package com.liuji.mall.config.swagger2;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).
                apiInfo(buildApiInfo()).
                pathMapping("/").
                select().
                apis(RequestHandlerSelectors.basePackage("com.liuji.mall.controller")).
                apis(RequestHandlerSelectors.withClassAnnotation(Api.class)).
                apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).
                build();
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder().
                title("mall项目接口文档").
                description("springboot security jwt swagger2 ......").
                contact(new Contact("liuji", "", "15504017815@163.com")).
                version("1.0").
                build();
    }
}
