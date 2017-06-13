package com.github.gitsby.configuration;

import com.github.gitsby.configuration.dataSource.DataSourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Kasyanov Maxim on 6/14/2017.
 */
@Configuration
@Import({DaoConfiguration.class,ServiceConfiguration.class,WebConfig.class, DataSourceConfig.class})
public class ApplicationConfig {
}
