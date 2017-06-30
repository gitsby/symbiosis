package com.github.gitsby.server.configuration;

import com.github.gitsby.db.configuration.DataSourceConfig;
import com.github.gitsby.db.configuration.ServiceConfiguration;
import com.github.gitsby.db.dao.DaoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Kasyanov Maxim on 6/14/2017.
 */
@Configuration
@Import({DaoConfiguration.class, ServiceConfiguration.class, WebConfig.class, DataSourceConfig.class})
public class ApplicationConfig {
}
