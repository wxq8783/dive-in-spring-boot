package com.wu.diveinspringboot.annotation;

import com.wu.diveinspringboot.configuration.HelloWordConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(HelloWordConfiguration.class)
@Import(HelloWordImportSelector.class)
public @interface EnableHelloWord {
}
