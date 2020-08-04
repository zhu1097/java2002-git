package com.qf.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan("com.qf")
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.driverClassName}")
    private String driverClassName;

    @Value("${jdbc.url}")
    private String url;
    @Bean
    public JdbcTemplate getJdbcTemplate(){
        Properties properties =new Properties();
        properties.setProperty("username",username);
        properties.setProperty("password",password);
        properties.setProperty("driverClassName",driverClassName);
        properties.setProperty("url",url);
        DataSource dataSource =null;
        try {
            dataSource=DruidDataSourceFactory.createDataSource(properties);
          JdbcTemplate jdbcTemplate =new JdbcTemplate(dataSource);
            return jdbcTemplate;
        } catch (Exception e) {
            e.printStackTrace();
        }
       throw new RuntimeException("数据库链接异常");
    }
}
