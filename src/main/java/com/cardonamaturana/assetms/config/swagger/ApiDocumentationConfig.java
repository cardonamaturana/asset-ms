package com.cardonamaturana.assetms.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiDocumentationConfig {

  @Bean
  public OpenAPI customOpenAPI() {
    OpenAPI openAPI = new OpenAPI();
    return openAPI;
  }
}
