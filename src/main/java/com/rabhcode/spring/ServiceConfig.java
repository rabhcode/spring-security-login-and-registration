package com.rabhcode.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.rabhcode.service" })
public class ServiceConfig {
}
