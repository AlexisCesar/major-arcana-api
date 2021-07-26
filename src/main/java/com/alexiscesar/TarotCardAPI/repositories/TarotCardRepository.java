package com.alexiscesar.TarotCardAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexiscesar.TarotCardAPI.entities.TarotCard;

public interface TarotCardRepository extends JpaRepository<TarotCard, Byte> {

}
