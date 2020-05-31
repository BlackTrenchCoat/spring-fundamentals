package org.theproject.springfundamentals.propertiesprespringboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.theproject.springfundamentals.propertiesprespringboot.HelloSPGHelperBean;

@Configuration
@PropertySource(value = "hi.properties")
public class PropertySourcesConfiguration {

    @Value("${salutation}")
    String salutation;

    @Value("${recipient}")
    String recipient;

    @Bean
    public HelloSPGHelperBean helloSPGHelperBean() {
        HelloSPGHelperBean result = new HelloSPGHelperBean(salutation, recipient);
        return result;
    }
}
