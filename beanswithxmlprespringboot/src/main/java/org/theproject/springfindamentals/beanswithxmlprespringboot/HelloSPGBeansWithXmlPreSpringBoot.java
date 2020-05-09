package org.theproject.springfindamentals.beanswithxmlprespringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSPGBeansWithXmlPreSpringBoot {

    // XML bean configuration
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        ApplicationPOJO applicationPOJO = context.getBean("applicationPojo", ApplicationPOJO.class);
        System.out.println(applicationPOJO);
    }

}
