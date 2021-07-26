package com.alexiscesar.TarotCardAPI.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alexiscesar.TarotCardAPI.entities.TarotCard;
import com.alexiscesar.TarotCardAPI.repositories.TarotCardRepository;

@Controller
@RequestMapping("/tarot-card")
public class TarotCardResource {
	
	@Autowired
	private TarotCardRepository repository;
	
	@GetMapping
	public ResponseEntity<List<TarotCard>> findAll() {
		List<TarotCard> deck = repository.findAll();
		return ResponseEntity.ok().body(deck);
	}
	
}
