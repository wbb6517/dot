package org.example.dotstart.mybatisflex.config;

import com.mybatisflex.core.keygen.KeyGeneratorFactory;
import com.mybatisflex.core.keygen.KeyGenerators;
import com.mybatisflex.core.keygen.impl.FlexIDKeyGenerator;
import com.mybatisflex.core.keygen.impl.SnowFlakeIDKeyGenerator;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.Inet4Address;

@Configuration
@Slf4j
public class MybatisFlexConfig {

    @Bean
    public void registerKeyGenerator(){
        KeyGeneratorFactory.register(KeyGenerators.snowFlakeId, new SnowFlakeIDKeyGenerator());
        log.info("替换雪花算法生成器");
    }

    private static FlexIDKeyGenerator keyGenerator;
    static {
        Long workId = getWorkId();
        log.info("work id :{}",workId);
        keyGenerator=new FlexIDKeyGenerator(workId);
    }


    @Bean
    public Object generate(Object entity, String keyColumn) {
        return keyGenerator.generate(entity,keyColumn);
    }


    /**
     * workId使用IP生成
     *
     * @return workId
     */
    private static Long getWorkId() {
        try {
            String hostAddress = Inet4Address.getLocalHost().getHostAddress();
            int[] ints = StringUtils.toCodePoints(hostAddress);
            int sums = 0;
            for (int b : ints) {
                sums = sums + b;
            }
            return (long) (sums % 32);
        } catch (Exception e) {
            // 失败就随机
            long workId = RandomUtils.nextLong(0, 99);
            log.info("获取地址失败，随机work id:{}", workId);
            return workId;
        }
    }
}
