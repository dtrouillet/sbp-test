package fr.trouillet.devportal;

import org.laxture.spring.util.ApplicationContextProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages = "fr.trouillet.devportal")
public class DevportalApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder();
		builder.sources(DevportalApplication.class);
		builder.build().run();
	}

	@Bean
	public ApplicationContextAware multiApplicationContextProviderRegister() {
		return ApplicationContextProvider::registerApplicationContext;
	}



}
