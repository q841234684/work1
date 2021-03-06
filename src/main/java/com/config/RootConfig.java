package com.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * Created by K on 2017/12/3.
 */
@Configuration
@ComponentScan(basePackages = "com",excludeFilters = {@ComponentScan.Filter(type=FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {



}
