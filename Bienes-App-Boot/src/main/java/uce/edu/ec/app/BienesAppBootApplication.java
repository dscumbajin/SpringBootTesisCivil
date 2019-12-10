package uce.edu.ec.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@ComponentScan(basePackages = "uce.edu.ec.app")
@EnableWebSecurity
@EnableAutoConfiguration(exclude = { SecurityFilterAutoConfiguration.class })
@ImportResource("security.xml")
public class BienesAppBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BienesAppBootApplication.class, args);
	}

}
