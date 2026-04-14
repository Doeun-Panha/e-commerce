package com.spring.e_commerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        // Maps the URL path (used in Flutter) to your physical folder
        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:user-photos/");
    }
}
