package com.alexiscesar.TarotCardAPI.config;

import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alexiscesar.TarotCardAPI.entities.TarotCard;
import com.alexiscesar.TarotCardAPI.repositories.TarotCardRepository;
import com.google.gson.Gson;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private TarotCardRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Gson gson = new Gson();
		
		String path = "majorArcana.json";
		FileReader fr = new FileReader(path);
		
		TarotCard[] cards = gson.fromJson(fr, TarotCard[].class);
		
		for(TarotCard card : cards)
			repository.save(card);
		
	}
	
}
