package com.estramipyme.crud.api.config;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;


@Configuration
public class FlywayConfig {
    private final Environment environment;

    public FlywayConfig(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public FlywayMigrationStrategy flywayMigrationStrategy() {
        return flyway -> {
            // Limpia la base de datos solo en desarrollo
            if (environment.acceptsProfiles(Profiles.of("dev"))) {
                flyway.clean();
            }
            flyway.migrate();
        };
    }
}
