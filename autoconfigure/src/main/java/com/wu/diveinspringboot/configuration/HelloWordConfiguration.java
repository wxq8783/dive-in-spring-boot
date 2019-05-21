package com.wu.diveinspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWordConfiguration {

    @Bean
    public String helloWord(){
        return "Hello,Word 2018";
    }
}
