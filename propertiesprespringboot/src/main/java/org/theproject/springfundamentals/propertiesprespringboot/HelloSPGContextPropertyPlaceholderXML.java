package org.theproject.springfundamentals.propertiesprespringboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSPGContextPropertyPlaceholderXML {

    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context-property-placeholder.xml");
        HelloSPGHelperBean bean =
                context.getBean(HelloSPGHelperBean.class);
        System.out.println(bean.getGreeting());
    }
}
