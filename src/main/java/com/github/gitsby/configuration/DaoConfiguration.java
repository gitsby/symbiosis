package com.github.gitsby.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Kasyanov Maxim on 6/14/2017.
 */
@Configuration
@ComponentScan("com.github.gitsby.dao.*")
public class DaoConfiguration {
}
