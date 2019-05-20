package com.wu.diveinspringboot.bootstrap;

import com.wu.diveinspringboot.annotation.EnableHelloWord;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableHelloWord
public class EnableHelloWordBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWordBootstrap.class).web(WebApplicationType.NONE).run(args);

        String helloWord = context.getBean("helloWord", String.class);

        System.out.println("helloWord bean:"+helloWord);
        context.close();
    }

}
