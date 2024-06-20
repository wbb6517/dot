package org.example.dotstart.aop.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author wbb
 */
@Slf4j
@Component
public class EasyDemo {
//    @Scheduled(cron = "0/1 * * * * ? ")
    public void saveInfo() {
        log.info("已保存");
    }
}
