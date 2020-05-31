package org.theproject.springfundamentals.propertiesprespringboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.theproject.springfundamentals.propertiesprespringboot.HelloSPGHelperBean;

@Configuration
public class PropertySourcesPlaceHolderConfigurerConfiguration {

    @Value("${salutation}")
    String salutation;

    @Value("${recipient}")
    String recipient;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer result =  new PropertySourcesPlaceholderConfigurer();
        result.setLocation(new ClassPathResource("hi.properties"));
        return result;
    }

    @Bean
    public HelloSPGHelperBean helloSPGHelperBean() {
        HelloSPGHelperBean result = new HelloSPGHelperBean(salutation, recipient);
        return result;
    }

}
