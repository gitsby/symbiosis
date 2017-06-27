package com.github.gitsby.db.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Kasyanov Maxim on 6/14/2017.
 */
@Configuration
@ComponentScan("com.github.gitsby.db.dao.*")
public class DaoConfiguration {
}
