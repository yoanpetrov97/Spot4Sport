package com.spot4sport.app;

import com.spot4sport.app.model.Court;
import com.spot4sport.app.repository.CourtRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initCourtDatabase(CourtRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Court("Court 1")));
            log.info("Preloading " + repository.save(new Court("Court 2")));
        };
    }
}
