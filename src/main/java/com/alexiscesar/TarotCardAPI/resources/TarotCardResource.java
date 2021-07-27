package com.alexiscesar.TarotCardAPI.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alexiscesar.TarotCardAPI.entities.TarotCard;
import com.alexiscesar.TarotCardAPI.services.TarotCardService;

@Controller
@RequestMapping("/tarot-card")
public class TarotCardResource {
	
	@Autowired
	TarotCardService service;
	
	@GetMapping
	public ResponseEntity<List<TarotCard>> findAll() {
		List<TarotCard> deck = service.findAll();
		return ResponseEntity.ok().body(deck);
	}
	
	@GetMapping("/{cardNumber}")
	public ResponseEntity<TarotCard> findById(@PathVariable byte cardNumber) {
		TarotCard card = service.findById(cardNumber);
		return ResponseEntity.ok().body(card);
	}
	
}
