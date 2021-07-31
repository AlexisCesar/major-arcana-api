package com.alexiscesar.TarotCardAPI.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "card")
public class TarotCard implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private byte cardNumber;
	private String cardName;
	@Column(length = 5000)
	private String cardDescription;
	
	public TarotCard() {
		
	}

	public TarotCard(byte cardNumber, String cardName, String cardDescription) {
		this.cardNumber = cardNumber;
		this.cardName = cardName;
		this.cardDescription = cardDescription;
	}

	public byte getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(byte cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardDescription() {
		return cardDescription;
	}

	public void setCardDescription(String cardDescription) {
		this.cardDescription = cardDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cardNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TarotCard other = (TarotCard) obj;
		if (cardNumber != other.cardNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TarotCard [cardNumber=" + cardNumber + ", cardName=" + cardName + ", cardDescription=" + cardDescription
				+ "]";
	}
	
}
