package com.gm222.server.config;

import lombok.Value;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    private String driverClassName;

    private String url;

    private String username;

    private String password;
}
