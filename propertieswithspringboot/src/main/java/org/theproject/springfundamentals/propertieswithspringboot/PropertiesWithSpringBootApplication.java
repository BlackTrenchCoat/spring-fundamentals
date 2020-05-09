package org.theproject.springfundamentals.propertieswithspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class PropertiesWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertiesWithSpringBootApplication.class, args);
	}

	@Component
	public class GetProperty implements CommandLineRunner {

		@Value("${greeting}")
		String greeting;

		public void run(String... args) {
			System.out.println(greeting);
		}
	}
}
