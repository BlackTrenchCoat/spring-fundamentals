package org.theproject.springfundamentals.propertiesprespringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.theproject.springfundamentals.propertiesprespringboot.config.PropertiesFactoryBeanConfiguration;

import java.util.Properties;

public class HelloSPGPropertiesFactoryBeanJava {

    // This is like using <util:properties> in an XML Spring application context, but instead using Java configuration.
    public static void main(String args[]) {
        // AnnotationConfigApplicationContext is commonly used to load a Java configuration from a class
        ApplicationContext context = new AnnotationConfigApplicationContext(PropertiesFactoryBeanConfiguration.class);
        Properties properties = (Properties) context.getBean("properties");
        String s = properties.getProperty("salutation");
        String r = properties.getProperty("recipient");
        System.out.println(s + " " + r);
    }

}
