package com.fh.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class Swagger2Config {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //为当前包下controller生成API文档 第一种方法，这一种方法不行就使用第二种
                .apis(RequestHandlerSelectors.basePackage("com.fh"))
                /*//第二种方法 或者 第三种指定那个类下面的方法
                .apis(RequestHandlerSelectors.basePackage("com.fh"))
                .apis(RequestHandlerSelectors.basePackage("com.fh.user.controller"))
                */
                //为有@Api注解的Controller生成API文档
//                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                //为有@ApiOperation注解的方法生成API文档
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("接口开发文档")
                .description("nmt-api")
                .contact(new Contact("袁莹莹","http://localhost:9090","y1215@2001.com"))
                .version("1.0")
                .build();
    }

}
