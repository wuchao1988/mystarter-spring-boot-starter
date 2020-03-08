package com.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@SpringBootApplication
public class DemoSpringbootApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoSpringbootApplication.class, args);
    }

}
