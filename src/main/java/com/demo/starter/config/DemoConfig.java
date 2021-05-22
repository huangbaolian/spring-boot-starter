package com.demo.starter.config;

import com.demo.starter.properties.DemoProperties;
import com.demo.starter.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DemoProperties.class)
@ConditionalOnWebApplication
public class DemoConfig {
    @Autowired
    private DemoProperties demoProperties;

    @Bean
    public DemoService demoService(){
        return new DemoService(demoProperties.getSayWhat(), demoProperties.getToWho());
    }
}
