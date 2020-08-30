package com.casestudy.nagraj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.nagraj.model.StockExchange;
import com.casestudy.nagraj.model.StockExchangeDto;
import com.casestudy.nagraj.service.StockExchangeService;

@RestController
public class StockExchangeController {

	@Autowired
	public StockExchangeService stockExchangeService;

	@GetMapping("/exchanges")
	public ResponseEntity<List<StockExchangeDto>> showAllExchanges()
	{
		return new ResponseEntity<List<StockExchangeDto>>(stockExchangeService.showAllExhanges(), HttpStatus.FOUND);
	}
	
	@PostMapping("/exchanges")
	public ResponseEntity<StockExchangeDto> addNewExchange(StockExchangeDto exchangeDto)
	{
		return new ResponseEntity<StockExchangeDto> (stockExchangeService.addExchange(exchangeDto),HttpStatus.CREATED);
	}
}
