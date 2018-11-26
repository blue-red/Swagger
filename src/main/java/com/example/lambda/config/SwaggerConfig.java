package com.example.lambda.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket petApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.lambda.web"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("开放接口API")  //粗标题
                .description("HTTP对外开放接口")   //描述
                .version("1.0.0")   //api version
                .termsOfServiceUrl("http://127.0.0.1:8080")
                .license("LICENSE")   //链接名称
                .licenseUrl("http://xxx.xxx.com")   //链接地址
                .build();
    }


   /* @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry
                        .addMapping("/api/pet")
                        .allowedOrigins("http://editor.swagger.io");
                registry
                        .addMapping("/v2/api-docs.*")
                        .allowedOrigins("http://editor.swagger.io");
            }
        };
    }*/















}
