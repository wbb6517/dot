package org.example.mybatisflex.config;


import com.mybatisflex.core.BaseMapper;
import com.mybatisflex.core.datasource.DataSourceDecipher;
import com.mybatisflex.core.logicdelete.LogicDeleteProcessor;
import com.mybatisflex.core.table.DynamicSchemaProcessor;
import com.mybatisflex.core.table.DynamicTableProcessor;
import com.mybatisflex.core.tenant.TenantFactory;
import com.mybatisflex.spring.boot.ConfigurationCustomizer;
import com.mybatisflex.spring.boot.MyBatisFlexCustomizer;
import com.mybatisflex.spring.boot.MybatisFlexProperties;
import com.mybatisflex.spring.boot.SqlSessionFactoryBeanCustomizer;
import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.scripting.LanguageDriver;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ResourceLoader;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@MapperScan(value = "org.example.**", sqlSessionTemplateRef = "sqlSessionTemplate", markerInterface = BaseMapper.class)
public class MybatisFlexAutoConfiguration extends com.mybatisflex.spring.boot.MybatisFlexAutoConfiguration {
    public MybatisFlexAutoConfiguration(MybatisFlexProperties properties,
                                        ObjectProvider<Interceptor[]> interceptorsProvider,
                                        ObjectProvider<TypeHandler[]> typeHandlersProvider,
                                        ObjectProvider<LanguageDriver[]> languageDriversProvider,
                                        ResourceLoader resourceLoader,
                                        ObjectProvider<DatabaseIdProvider> databaseIdProvider,
                                        ObjectProvider<List<ConfigurationCustomizer>> configurationCustomizersProvider,
                                        ObjectProvider<List<SqlSessionFactoryBeanCustomizer>> sqlSessionFactoryBeanCustomizers,
                                        ObjectProvider<DataSourceDecipher> dataSourceDecipherProvider,
                                        ObjectProvider<DynamicTableProcessor> dynamicTableProcessorProvider,
                                        ObjectProvider<DynamicSchemaProcessor> dynamicSchemaProcessorProvider,
                                        ObjectProvider<TenantFactory> tenantFactoryProvider,
                                        ObjectProvider<LogicDeleteProcessor> logicDeleteProcessorProvider,
                                        ObjectProvider<MyBatisFlexCustomizer> mybatisFlexCustomizerProvider) {
        super(properties,
                interceptorsProvider,
                typeHandlersProvider,
                languageDriversProvider,
                resourceLoader,
                databaseIdProvider,
                configurationCustomizersProvider,
                sqlSessionFactoryBeanCustomizers,
                dataSourceDecipherProvider,
                dynamicTableProcessorProvider,
                dynamicSchemaProcessorProvider,
                tenantFactoryProvider,
                logicDeleteProcessorProvider,
                mybatisFlexCustomizerProvider);
    }

    @Override
    @Bean
    @Primary
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        return super.sqlSessionFactory(dataSource);
    }

    @Override
    @Bean
    @Primary
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return super.sqlSessionTemplate(sqlSessionFactory);
    }

}
