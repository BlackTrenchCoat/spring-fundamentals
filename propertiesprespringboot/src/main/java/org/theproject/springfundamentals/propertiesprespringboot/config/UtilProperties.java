package org.theproject.springfundamentals.propertiesprespringboot.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

// Java configuration example that is equivalent to using util:properties in XML configuration

@Configuration
public class UtilProperties {

    @Bean(name="properties")
    public PropertiesFactoryBean propertiesFactoryBean() {
        PropertiesFactoryBean result = new PropertiesFactoryBean();
        result.setLocation(new ClassPathResource("hi.properties"));
        return result;
    }
}
