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
	         .groupName("University Management Platform")
//	                .ignoredParameterTypes(ProfileController.class) // coming automatically with Spring Data Rest
//	                .ignoredParameterTypes(WebSocketSession.class)
	         .ignoredParameterTypes(XmlAttribute.class, XmlElement.class, Period.class)
	         .select()
	         .apis(RequestHandlerSelectors.basePackage("com.university.management.rest.controller"))
	         .paths(PathSelectors.ant("/foos/*"))   
	         //.paths(PathSelectors.regex("(.*\\/api\\/.*|.*\\/management\\/.*)")) //PathSelectors.any())
	         .build()
	         .apiInfo(apiInfo())
	         .tags(new Tag("Unversit Management", "Channel API Collection for Unversit Management"), 
	               new Tag("University", "University API Collection for UMMA Instances")
	         );
	   }     

	   private ApiInfo apiInfo() {
	      return new ApiInfoBuilder()
	         .title("Univesity Management Banking Component APIs")
	         .description("RESTful API Component Description")
	         .version("1.0.5")
	         .build();
	   }

}
