package org.theproject.springfundamentals.propertiesprespringboot;

public class HelloSPGHelperBean {

    String salutation;
    String recipient;

    public HelloSPGHelperBean(String salutation, String recipient) {
        this.salutation = salutation;
        this.recipient = recipient;
    }

    public String getGreeting() {
        return salutation + " " + recipient;
    }
}
