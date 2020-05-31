package org.theproject.springfundamentals.propertiesprespringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.theproject.springfundamentals.propertiesprespringboot.config.PropertySourcesPlaceHolderConfigurerConfiguration;

public class HelloPropertySourcesPlaceHolderConfigurerJava {
    public static void main(String args[]) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(PropertySourcesPlaceHolderConfigurerConfiguration.class);
        HelloSPGHelperBean bean = context.getBean(HelloSPGHelperBean.class);
        System.out.println(bean.getGreeting());
    }
}
