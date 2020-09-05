package com.casestudy.nagraj.company;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;

@Configuration
@EnableSwagger2
public class SwaggerFoxConfig {
	
	@Bean
	public Docket todoApi() 
	{
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}
	
	private Predicate<String> postPaths()
	{
		return or(regex("/company.*"));
	}
	
	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo()
	{
		//linkedin.com/in/bhagwana-ram-887565147"
		
		return new ApiInfoBuilder().title("toDO API")
				.description("API reference for ToDo")
				.termsOfServiceUrl("https://www/linkedin.com")  
				.contact("dnagraj998@gmail.com").license("ToDo License")
				.licenseUrl("dnagraj998@gmail.com").version("1.0").build();
	}

}
