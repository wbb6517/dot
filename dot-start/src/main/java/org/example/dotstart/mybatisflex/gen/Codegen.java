package org.example.dotstart.mybatisflex.gen;

import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.codegen.Generator;
import com.mybatisflex.codegen.config.ColumnConfig;
import com.mybatisflex.codegen.config.EntityConfig;
import com.mybatisflex.codegen.config.GlobalConfig;
import com.mybatisflex.core.keygen.KeyGenerators;
import com.zaxxer.hikari.HikariDataSource;

public class Codegen {

    public static void main(String[] args) {
        //配置数据源
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/flex_test?useInformationSchema=true&characterEncoding=utf-8");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        //创建配置内容，两种风格都可以。
        GlobalConfig globalConfig = createGlobalConfigUseStyle1();
//        GlobalConfig globalConfig = createGlobalConfigUseStyle2();

        //通过 datasource 和 globalConfig 创建代码生成器
        Generator generator = new Generator(dataSource, globalConfig);

        //生成代码
        generator.generate();
    }

    public static GlobalConfig createGlobalConfigUseStyle1() {
        //创建配置内容
        GlobalConfig globalConfig = new GlobalConfig();

        // 设置表前缀和只生成哪些表
        globalConfig.setGenerateTable("tb_account","b_banner");

        // 生成文件
        globalConfig.enableEntity();
        globalConfig.enableMapper();
        globalConfig.enableService();
        globalConfig.enableServiceImpl();
        globalConfig.enableController();
        globalConfig.enableMapperXml();
        globalConfig.enableTableDef();
//        globalConfig.enablePackageInfo();

        // 注释配置
        globalConfig.getJavadocConfig()
                .setAuthor("wbb");

        // 包配置
        globalConfig.getPackageConfig()
                .setSourceDir("E:\\IdeaProjects\\dot\\dot-start\\src\\main\\java")
                .setBasePackage("org.example.dotstart.mybatisflex");

        // 主键策略配置
        ColumnConfig idColumnConfig = new ColumnConfig();
        idColumnConfig.setColumnName("id");
        idColumnConfig.setPrimaryKey(true);
        idColumnConfig.setKeyType(KeyType.Generator);
        idColumnConfig.setKeyValue(KeyGenerators.snowFlakeId);

        // 策略配置
        globalConfig.getStrategyConfig()
                .setTablePrefix("tb_","t_","b_")
                .setLogicDeleteColumn("deleted")
                .setColumnConfig(idColumnConfig)
                .setIgnoreColumns();

        // 模板配置
        globalConfig.getTemplateConfig()
                //.setTemplate()
        ;

        // 实体配置
        globalConfig.getEntityConfig()
                .setClassSuffix("Entity")
                .setSuperClass(null)
                .setOverwriteEnable(true)
                .setWithLombok(true)
                .setWithSwagger(true)
                .setSwaggerVersion(EntityConfig.SwaggerVersion.DOC)
                .setJdkVersion(17);

        // Mapper 配置
        globalConfig.getMapperConfig()
                .setOverwriteEnable(false)
                .setMapperAnnotation(true);

        // Service 配置
        globalConfig.getServiceConfig();

        // ServiceImpl 配置
        globalConfig.getServiceImplConfig()
                //.setOverwriteEnable(true)
                //.setCacheExample(true)
        ;

        // Controller 配置
        globalConfig.getControllerConfig();

        // TableDef 配置
        globalConfig.getTableDefConfig()
                .setOverwriteEnable(true);

        // MapperXml 配置
        globalConfig.getMapperXmlConfig();


        return globalConfig;
    }

}
