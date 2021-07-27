package com.alexiscesar.TarotCardAPI.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.alexiscesar.TarotCardAPI.services.exceptions.CardNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(CardNotFoundException.class)
	public ResponseEntity<StandardError> cardNotFound(CardNotFoundException e, HttpServletRequest request) {
		String error = "Card not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError errorResponse = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(errorResponse);
	}
	
}
