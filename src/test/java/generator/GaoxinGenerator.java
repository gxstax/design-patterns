package generator;//package com.heytea.service.member.generator;
//
//import com.baomidou.mybatisplus.annotation.DbType;
//import com.baomidou.mybatisplus.annotation.FieldFill;
//import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.po.TableFill;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//import org.junit.Test;
//
//import java.util.Arrays;
//
///**
// * @author 李健雄
// * @date 2018/11/02 16:49
// */
//public class GaoxinGenerator {
//
//    /** 作者. */
//    private static final String AUTHOR = "GaoXin";
//
//    /** 数据库 .*/
//    private static final String USERNAME = "heytea";
//    private static final String PASSWORD = "heytea888";
//    private static final String DB_URL = "jdbc:mysql://10.0.3.11:3306/heytea_pos?characterEncoding=utf8&useSSL=false&allowMultiQueries=true" ;
//    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
//
//    /** 代码生成输出目录. */
//    private static final String OUTPUT_DIR = "./";
//    /** 生成的包名 .*/
//    private static final String PACKEGE_NAME = "com.heytea.service.member";
//
//    /**
//     * 根据表名生成对应的实体类，repository，service，controller（都是单表）
//     * 注: repository.xml默认生成在mapper/xml下，需要手动移动到resource/mapper下
//     */
//    @Test
//    public void generateCode() {
//        generateByTables(PACKEGE_NAME,"t_member_reliable_msg");
//    }
//
//    private void generateByTables(String packageName, String... tableNames) {
//        GlobalConfig globalConfig = new GlobalConfig();
//        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//        StrategyConfig strategyConfig = new StrategyConfig();
//        PackageConfig packageConfig = new PackageConfig();
//
//        dataSourceConfig.setDbType(DbType.MYSQL)
//                .setDriverName(DRIVER_NAME)
//                .setUrl(DB_URL).setUsername(USERNAME)
//                .setPassword(PASSWORD);
//
//        strategyConfig.setCapitalMode(true)
//                .setDbColumnUnderline(true)
//                .setNaming(NamingStrategy.underline_to_camel) //下划线转驼峰
//                .setEntityLombokModel(true)
//                .setInclude(tableNames) //要生成代码的表名（可以是多个，以String数组表示）
//                .setRestControllerStyle(true) //生成controller的注解为@RestController
//                .setTableFillList(Arrays.asList(
//                        new TableFill("created_at", FieldFill.INSERT),
//                        new TableFill("updated_at",FieldFill.INSERT_UPDATE)));
//
//        packageConfig.setParent(PACKEGE_NAME)
//                .setMapper("repository")
//                .setService("service.order")
//                .setController("controller")
//                .setEntity("model.entity");
//
//        globalConfig.setActiveRecord(false)
//                .setAuthor(AUTHOR)
//                .setOutputDir(OUTPUT_DIR+"/src/main/java")
//                .setFileOverride(false)
//                .setIdType(IdType.AUTO)     //主键策略
//                .setServiceName("%sService")
//                .setBaseResultMap(true)
//                .setBaseColumnList(true);
//
//        new AutoGenerator().setGlobalConfig(globalConfig).setDataSource(dataSourceConfig)
//                .setStrategy(strategyConfig).setPackageInfo(packageConfig)
//                .execute();
//    }
//}
