package com.Harri.WorldSoccer;

import com.Harri.WorldSoccer.Service.CountryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WorldSoccerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorldSoccerApplication.class, args);
	}

	@Bean
	public CountryService countryService() {
		return new CountryService();
	}
}
