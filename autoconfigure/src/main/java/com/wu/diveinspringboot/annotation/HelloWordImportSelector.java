package com.wu.diveinspringboot.annotation;

import com.wu.diveinspringboot.configuration.HelloWordConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class HelloWordImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{HelloWordConfiguration.class.getName()};
    }
}
