package com.alexiscesar.TarotCardAPI.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexiscesar.TarotCardAPI.entities.TarotCard;
import com.alexiscesar.TarotCardAPI.repositories.TarotCardRepository;
import com.alexiscesar.TarotCardAPI.services.exceptions.CardNotFoundException;

@Service
public class TarotCardService {
	
	@Autowired
	private TarotCardRepository repository;
	
	public List<TarotCard> findAll() {
		return repository.findAll();
	}
	
	public TarotCard findById(byte id) {
		return searchCard(id);
	}

	private TarotCard searchCard(byte id) {
		Optional<TarotCard> card = repository.findById(id);
		
		//TODO change exception to a personalized one
		return card.orElseThrow(() -> new CardNotFoundException("No card with this number was found! Major arcana only contains cards from 0 to 21."));
	}
	
}
