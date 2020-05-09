package org.theproject.springfundamentals.beanswithannotationsspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class BeansWithAnnotationsSpringBootApplication {

	@Autowired
	GotPojo gotPojo;

	public static void main(String[] args) {
		SpringApplication.run(BeansWithAnnotationsSpringBootApplication.class, args);
	}

	@Component
	public class GetProperty implements CommandLineRunner {
		public void run(String... args) {
			System.out.println(gotPojo.longLiveTheMonarch());
		}
	}

}
