package org.example.dotstart.scheduling;


import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * 定时任务
 * @author wbb
 */
@Slf4j
@Component
public class EasyScheduling {
    final Long startTime = this.startTime();

    // Spring容器启动后立即获取当前时间
    public Long startTime() {
        long timeMillis = System.currentTimeMillis();
        log.info("系统开始运行时间: {} ", timeMillis);
        return timeMillis;
    }


    // 每分钟执行一次
    @Scheduled(cron = "0 0/1 * * * ? ")
    public void syncInfo() {
        // 输出系统运行的时间(秒)
        log.info("系统运行了 {} 分钟", (System.currentTimeMillis() - startTime) / (1000 * 60));
    }
}
