package com.github.gitsby.db.configuration;

import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by Kasyanov Maxim on 6/14/2017.
 */
@Configuration
@PropertySource(name = "localProp", value = {"classpath:application-${spring.profiles.active}.properties"})
public class DataSourceConfig {

    @Autowired
    private Environment environment;

    @Bean(name = "dataSource")
    @Profile("prod")
    public DataSource prodDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClass"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        dataSource.setPoolPreparedStatements(Boolean.valueOf(environment.getRequiredProperty("jdbc.poolPreparedStatements")));
        dataSource.setMaxIdle(Integer.valueOf(environment.getRequiredProperty("jdbc.maxIdle")));
        dataSource.setMinIdle(Integer.valueOf(environment.getRequiredProperty("jdbc.minIdle")));
        dataSource.setInitialSize(Integer.valueOf(environment.getRequiredProperty("jdbc.initialSize")));
        dataSource.setTimeBetweenEvictionRunsMillis(Integer.valueOf(environment.getRequiredProperty("jdbc.timeBetweenEvictionRunsMillis")));
        dataSource.setMinEvictableIdleTimeMillis(Integer.valueOf(environment.getRequiredProperty("jdbc.minEvictableIdleTimeMillis")));
        dataSource.setTestWhileIdle(Boolean.valueOf(environment.getRequiredProperty("jdbc.testWhileIdle")));
        dataSource.setMinEvictableIdleTimeMillis(Integer.valueOf(environment.getRequiredProperty("jdbc.removeAbandonedTimeout")));
        dataSource.setTestOnBorrow(Boolean.valueOf(environment.getRequiredProperty("jdbc.testOnBorrow")));
        dataSource.setValidationQuery(environment.getRequiredProperty("jdbc.validationQuery"));
        return dataSource;
    }


    @Bean(name = "dataSource")
    @Profile("dev")
    public DataSource DevDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClass"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        dataSource.setPoolPreparedStatements(Boolean.valueOf(environment.getRequiredProperty("jdbc.poolPreparedStatements")));
        dataSource.setValidationQuery(environment.getRequiredProperty("jdbc.validationQuery"));
        return dataSource;
    }
}
