package com.estramipyme.crud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;

@Configuration
public class EnvironmentConfig {

    @Bean
    public Dotenv dotenv() {
        return Dotenv.configure()
                .directory("src/main/resources/env")
                .filename(".env")
                .load();
    }
}