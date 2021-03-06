package com.wrtecnologia.cepservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.function.Predicate;

@Configuration
public class SwaggerConfig {

	// url: http://localhost/swagger-ui/index.html

	ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("CEP Service API")
				.description("Serviço de consulta de cep")
				.license("Apache 2.0")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.termsOfServiceUrl("")
				.version("0.0.1-SNAPSHOT")
				.contact(new Contact("Wagner Pires", "http://www.github.com/wagnerpires", "wagnerdba@gmail.com"))
				.build();
	}

	@Bean
	public Docket swagger() {
	    return new Docket(DocumentationType.SWAGGER_2)
		  .select()
		  .apis(RequestHandlerSelectors.any())
		  .paths(PathSelectors.any())
	          .paths(Predicate.not(PathSelectors.regex("/error.*")))
		  .build()
		  .apiInfo(apiInfo());
	}
}
