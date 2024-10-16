package org.example.dotstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableAsync
@EnableScheduling
@SpringBootApplication(scanBasePackages = {"org.example.**"})
public class DotStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(DotStartApplication.class, args);
    }

}
