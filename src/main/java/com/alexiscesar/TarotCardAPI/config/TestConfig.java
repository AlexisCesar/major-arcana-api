package com.alexiscesar.TarotCardAPI.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alexiscesar.TarotCardAPI.entities.TarotCard;
import com.alexiscesar.TarotCardAPI.repositories.TarotCardRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private TarotCardRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		TarotCard fool = new TarotCard((byte) 0, "The Fool", "The fool is the first card of major arcana.");
		TarotCard magician = new TarotCard((byte) 1, "The Magician", "The magician is the second card of major arcana and he represents manifestation.");
		TarotCard highPriestess = new TarotCard((byte) 2, "The High Priestess", "She represents the inner knowledge and the unconscious.");
		TarotCard empress = new TarotCard((byte) 3, "The Empress", "This card represents--");
		
		repository.saveAll(Arrays.asList(fool, magician, highPriestess, empress));
		
	}
	
}
