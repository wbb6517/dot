package org.example.dotstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class DotStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(DotStartApplication.class, args);
    }

}
