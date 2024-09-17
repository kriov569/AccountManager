package com.kriov569.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:account-manager.properties")
public class PropertiesConfiguration {
}