package edu.template.builder.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    public OpenAPI hotelBookingOpenApi() {
        return new OpenAPI()
                .info(new Info().title("Hotel Booking API")
                        .description("API for hotel bookings with builder pattern")
                        .version("v1.0")
                        .contact(new Contact()
                                .name("Your Name")
                                .email("your.email@example.com")))
                .externalDocs(new ExternalDocumentation()
                        .description("Builder Pattern Documentation")
                        .url("https://refactoring.guru/design-patterns/builder"));
    }
}
