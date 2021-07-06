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
            log.info("Preloading " + repository.save(new Court("Зала \"Христо Ботев\"",
                  "1 зала за волейбол",
                  "ж.к. \"Студентски град\"")));
            log.info("Preloading " + repository.save(new Court("Спортна зала \"Fireball\"",
                  "1 зала за волейбол, 2 бадминтон корта, 1 зала за скуош, 4 тенис маси",
                  "Цариградско шосе 133, БИЦ-ИЗОТ корпус 4")));

            log.info("Preloading " + repository.save(new Court("Спортен център \"Денис Белинов\"",
                  "1 зала за баскетбол",
                  "ж.к. не трябваше да ни изоставяш")));
            log.info("Preloading " + repository.save(new Court("Някаква зала \"Еди коя си\"",
                  "3 игрища за футбол, 1 игрище за баскетбол, 2 тенис корта",
                  "Някъде в София, примерно")));
        };
    }
}
