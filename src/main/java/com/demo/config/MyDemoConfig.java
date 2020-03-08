package com.demo.config;
import com.demo.properties.MyDemoProperties;
import com.demo.service.MyDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
@EnableConfigurationProperties(MyDemoProperties.class)
public class MyDemoConfig {
    @Autowired
    private MyDemoProperties myProperties;

    @Bean(name = "demoService")
    public MyDemoService demoService(){
        return new MyDemoService(myProperties.getName(), myProperties.getEmail());
    }
}
