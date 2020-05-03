package org.theproject.springfundamentals.propertiesprespringboot;

public class HelloSPGContextPropertyPlaceholderHelperBean {

    String greeting;

    public HelloSPGContextPropertyPlaceholderHelperBean(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }
}
