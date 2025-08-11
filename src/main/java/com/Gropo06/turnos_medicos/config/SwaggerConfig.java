package com.Gropo06.turnos_medicos.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
            .info(new Info()
                .title("API Turnos Médicos")
                .version("1.0")
                .description("Documentación de la API de Turnos Médicos - Cátedra OO2")
            );
    }
}
