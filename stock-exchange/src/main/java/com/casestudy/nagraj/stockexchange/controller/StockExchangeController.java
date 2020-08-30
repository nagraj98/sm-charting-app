package com.casestudy.nagraj.stockexchange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.nagraj.stockexchange.model.StockExchange;
import com.casestudy.nagraj.stockexchange.model.StockExchangeDto;
import com.casestudy.nagraj.stockexchange.service.StockExchangeService;


@RequestMapping("/exchanges")
@RestController
public class StockExchangeController {

	@Autowired
	public StockExchangeService stockExchangeService;
	
	@GetMapping("/hey")
	public String sayHi()
	{
		return "Hi";
	}

	@GetMapping("/showall")
	public ResponseEntity<List<StockExchangeDto>> showAllExchanges()
	{
		return new ResponseEntity<List<StockExchangeDto>>(stockExchangeService.showAllExhanges(), HttpStatus.FOUND);
	}
	
	@PostMapping("/add")
	public ResponseEntity<StockExchangeDto> addNewExchange(StockExchangeDto exchangeDto)
	{
		return new ResponseEntity<StockExchangeDto> (stockExchangeService.addExchange(exchangeDto),HttpStatus.CREATED);
	}
}
