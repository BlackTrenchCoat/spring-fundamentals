package org.theproject.springfundamentals.beanswithxmlprespringboot;

public class ApplicationPOJO {

    String salutation;
    String recipient;

    public ApplicationPOJO(String salutation, String recipient) {
        this.salutation = salutation;
        this.recipient = recipient;
    }

    public String toString() {
        return salutation + " " + recipient;
    }
}
