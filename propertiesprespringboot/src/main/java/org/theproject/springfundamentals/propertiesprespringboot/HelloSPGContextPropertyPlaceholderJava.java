package org.theproject.springfundamentals.propertiesprespringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.theproject.springfundamentals.propertiesprespringboot.config.ContextPropertyPlaceholderProperties;

public class HelloSPGContextPropertyPlaceholderJava {

    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextPropertyPlaceholderProperties.class);
        HelloSPGContextPropertyPlaceholderHelperBean bean =
                context.getBean(HelloSPGContextPropertyPlaceholderHelperBean.class);
        System.out.println(bean.getGreeting());
    }
}
