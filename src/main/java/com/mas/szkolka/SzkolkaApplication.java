package com.mas.szkolka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class SzkolkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SzkolkaApplication.class, args);
    }

}
