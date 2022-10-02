package com.wzc.teamdemo.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import com.google.common.base.Predicates;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
@EnableKnife4j
public class SwaggerConfig{

    @Bean
    public Docket createRestBmbsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Api")
                .enable(true)
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //包下的类，才生成接口文档
//                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .apis(Predicates.or(
                        RequestHandlerSelectors.basePackage("com.wzc.teamdemo")
                ))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("趣旅行 api")
                .description("api文档")
                .termsOfServiceUrl("http://localhost:8080/")
                .version("0.0.1")
                .build();
    }

}