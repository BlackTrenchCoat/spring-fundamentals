package org.theproject.springfundamentals.propertiesprespringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.theproject.springfundamentals.propertiesprespringboot.HelloSPGContextPropertyPlaceholderHelperBean;

@Configuration
public class ContextPropertyPlaceholderProperties {

    @Bean(name="properties")
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer result = new PropertySourcesPlaceholderConfigurer();
        result.setLocation(new ClassPathResource("hi.properties"));
        return result;
    }

    @Bean(name="helper")
    public static HelloSPGContextPropertyPlaceholderHelperBean helloSPGContextPropertyPlaceholderHelperBean() {
        HelloSPGContextPropertyPlaceholderHelperBean result =
                new HelloSPGContextPropertyPlaceholderHelperBean("${greeting}");
        return result;
    }
}
