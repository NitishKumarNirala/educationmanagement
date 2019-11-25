package com.university.management.swagger.config;

import java.time.Period;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Profile("default") // [rj] provide a non-"test" profile to disable this configuration on tests
@Configuration
@EnableSwagger2

public class SwaggerConfig {

 @Bean
 /**
  * The Swagger Beans are created here because of a Swagger UI bug when it comes to deploying to a J2EE container.
  * 
  * @return
  */
 public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
       .groupName("Unversity Management")
       .ignoredParameterTypes(XmlAttribute.class, XmlElement.class, Period.class)
       .select()
       .apis(RequestHandlerSelectors.basePackage("com.unversity"))
       .paths(PathSelectors.regex("(.*\\/api\\/.*|.*\\/admin\\/.*)")) 
       .build()
       .apiInfo(apiInfo())
       .tags(new Tag("Merchant Gateway collection", "Channel API Collection for merchant"), 
             new Tag("Swagger", "Admin API Collection for DBMM Instances")
       );
 }     

 private ApiInfo apiInfo() {
	    return new ApiInfoBuilder()
	       .title("unversity Component APIs")
	       .description("RESTful API Component Description")
	       .version("1.0")
	       .build();
	 }

}