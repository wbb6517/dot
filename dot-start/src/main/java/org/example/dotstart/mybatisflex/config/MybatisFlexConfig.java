package org.example.dotstart.mybatisflex.config;

import com.mybatisflex.core.FlexGlobalConfig;
import com.mybatisflex.core.mybatis.FlexConfiguration;
import com.mybatisflex.spring.boot.ConfigurationCustomizer;
import com.mybatisflex.spring.boot.MyBatisFlexCustomizer;
import com.mybatisflex.spring.boot.SqlSessionFactoryBeanCustomizer;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisFlexConfig implements
        ConfigurationCustomizer,
        SqlSessionFactoryBeanCustomizer,
        MyBatisFlexCustomizer {
    @Override
    public void customize(FlexConfiguration configuration) {
        configuration.setLogImpl(StdOutImpl.class);
        System.out.println("MybatisConfiguration");
    }

    @Override
    public void customize(SqlSessionFactoryBean factoryBean) {
        System.out.println("SqlSessionFactoryBean");
    }

    @Override
    public void customize(FlexGlobalConfig globalConfig) {
        System.out.println("FlexGlobalConfig");

    }
}
