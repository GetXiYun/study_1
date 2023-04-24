package com.tcx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.tcx.controller", "com.tcx.config"})
@EnableWebMvc   //开启将json转换为对象
public class SpringMvcConfig {
}
