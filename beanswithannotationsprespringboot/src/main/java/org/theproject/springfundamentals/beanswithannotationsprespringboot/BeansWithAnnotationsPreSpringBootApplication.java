package org.theproject.springfundamentals.beanswithannotationsprespringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansWithAnnotationsPreSpringBootApplication {

    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        RunApplication runApplication = context.getBean(RunApplication.class);
        runApplication.printMessage();
    }
}