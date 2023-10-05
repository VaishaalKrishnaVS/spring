package com.springl.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {com.springl.bean.Person.class, com.springl.bean.Vehicle.class})
public class ProjectConfig {
}
