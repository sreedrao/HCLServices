/**
 * 
 */
package com.hcl.hackathon.fullstack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;
/**
 * @author sdama
 *
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig
{
	@Bean
	public Docket productApi()
	{
		return new Docket(DocumentationType.SWAGGER_2)
					   .select()
					   .apis(RequestHandlerSelectors.basePackage("com.hcl.hackathon.fullstack.controllers"))
					   .paths(regex("/.*"))
					   .build()
					   .apiInfo(metaData());
	}

	/**
	 * Meta data for swagger end point.
	 *
	 * @return Meta data.
	 */
	private ApiInfo metaData()
	{
		return new ApiInfo(
				"Hackathon Simple CRUD Services",
				"Simple CRUD REST API",
				"1.0",
				null,
				new Contact("Sreenivasa Dama", null, "sreenivasa.dama@thomsonreuters.com"),
				null,  
				null   
		);
	}
}
