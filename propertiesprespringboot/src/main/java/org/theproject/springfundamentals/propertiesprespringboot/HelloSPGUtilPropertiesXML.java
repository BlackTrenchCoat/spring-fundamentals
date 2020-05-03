package org.theproject.springfundamentals.propertiesprespringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

public class HelloSPGUtilPropertiesXML {

    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("util-properties.xml");
        Properties properties = context.getBean("properties", Properties.class);
        String hi = properties.getProperty("greeting");
        System.out.println(hi);
    }

}
