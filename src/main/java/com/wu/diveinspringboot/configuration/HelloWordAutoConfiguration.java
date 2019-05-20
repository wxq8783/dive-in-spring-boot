package com.wu.diveinspringboot.configuration;

import com.wu.diveinspringboot.annotation.EnableHelloWord;
import com.wu.diveinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHelloWord
@ConditionalOnSystemProperty(name = "user.name",value = "天&赐&清")
public class HelloWordAutoConfiguration {
}
