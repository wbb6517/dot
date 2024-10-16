package org.example.dotstart.mybatisflex.config;

import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.autoconfigure.MybatisPlusProperties;
import com.baomidou.mybatisplus.autoconfigure.MybatisPlusPropertiesCustomizer;
import com.baomidou.mybatisplus.autoconfigure.SqlSessionFactoryBeanCustomizer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.scripting.LanguageDriver;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@MapperScan( value = "org.example.dotstart.mybatisflex.mapper",sqlSessionTemplateRef = "plusSqlSessionTemplate",markerInterface = BaseMapper.class)
public class MybatisPlusAutoConfiguration extends com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration {
    public MybatisPlusAutoConfiguration(MybatisPlusProperties properties,
                                        ObjectProvider<Interceptor[]> interceptorsProvider,
                                        ObjectProvider<TypeHandler[]> typeHandlersProvider,
                                        ObjectProvider<LanguageDriver[]> languageDriversProvider,
                                        ResourceLoader resourceLoader, ObjectProvider<DatabaseIdProvider> databaseIdProvider,
                                        ObjectProvider<List<ConfigurationCustomizer>> configurationCustomizersProvider,
                                        ObjectProvider<List<SqlSessionFactoryBeanCustomizer>> sqlSessionFactoryBeanCustomizers,
                                        ObjectProvider<List<MybatisPlusPropertiesCustomizer>> mybatisPlusPropertiesCustomizerProvider,
                                        ApplicationContext applicationContext) {
        super(properties, interceptorsProvider, typeHandlersProvider, languageDriversProvider, resourceLoader, databaseIdProvider, configurationCustomizersProvider, sqlSessionFactoryBeanCustomizers, mybatisPlusPropertiesCustomizerProvider, applicationContext);
    }

    @Override
    @Bean("plusSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        return super.sqlSessionFactory(dataSource);
    }

    @Override
    @Bean("plusSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("plusSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return super.sqlSessionTemplate(sqlSessionFactory);
    }
}
