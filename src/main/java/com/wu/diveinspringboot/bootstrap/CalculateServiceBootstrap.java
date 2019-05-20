package com.wu.diveinspringboot.bootstrap;

import com.wu.diveinspringboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.wu.diveinspringboot.service")
public class CalculateServiceBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("java7")
                .run(args);
        CalculateService calculateService = applicationContext.getBean(CalculateService.class);

        System.out.println("计算(1....10)的总数:"+calculateService.sum(1,2,3,4,5,6,7,8,9,10));
        applicationContext.close();
    }
}
