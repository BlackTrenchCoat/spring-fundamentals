package org.theproject.springfundamentals.propertiesprespringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.theproject.springfundamentals.propertiesprespringboot.config.UtilProperties;

import java.util.Properties;

public class HelloSPGUtilPropertiesJava {

    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UtilProperties.class);
        Properties properties = (Properties) context.getBean("properties");
        String hi = properties.getProperty("greeting");
        System.out.println(hi);
    }

}
