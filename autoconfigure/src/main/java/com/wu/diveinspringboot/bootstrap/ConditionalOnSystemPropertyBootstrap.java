package com.wu.diveinspringboot.bootstrap;

import com.wu.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

public class ConditionalOnSystemPropertyBootstrap {

    @ConditionalOnSystemProperty(name = "user.name",value = "天&赐&清")
    @Bean
    public String helloWord(){
        return "Hello,word wuxiaoqing";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloword = context.getBean("helloWord",String.class);
        System.out.println("-------------->"+helloword);
        context.close();
    }
}
