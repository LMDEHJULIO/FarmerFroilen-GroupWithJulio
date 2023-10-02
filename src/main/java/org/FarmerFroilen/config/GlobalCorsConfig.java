package org.FarmerFroilen.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GlobalCorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")             // Match all endpoints.
                .allowedOrigins("*")           // Allow all origins.
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Allow specific HTTP methods.
//                .allowCredentials(true)        // Allow sending cookies.
                .allowedHeaders("*")           // Allow all headers.
                .maxAge(3600);                 // How long the pre-flight request will be cached in seconds.

        System.out.println("Cors mapping is running");
    }
}
