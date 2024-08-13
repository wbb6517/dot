package org.example.dotstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
@EnableAsync
@MapperScan("org.example.dotstart.mybatisflex.mapper")
public class DotStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(DotStartApplication.class, args);
    }

}
