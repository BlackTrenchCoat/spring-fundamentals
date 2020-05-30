package org.theproject.springfundamentals.propertiesprespringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.theproject.springfundamentals.propertiesprespringboot.config.UtilProperties;

import java.util.Properties;

public class HelloSPGUtilPropertiesJava {

    // This is like using <util:properties> in an XML Spring application context, but instead using Java configuration.
    // The UtilProperties class uses a PropertiesFactoryBean for the same effect as <util:properties>
    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UtilProperties.class);
        Properties properties = (Properties) context.getBean("properties");
        String s = properties.getProperty("salutation");
        String r = properties.getProperty("recipient");
        System.out.println(s + " " + r);
    }

}
