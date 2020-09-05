package com.casestudy.nagraj.stockexchange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.nagraj.stockexchange.model.StockExchange;
import com.casestudy.nagraj.stockexchange.model.StockExchangeDto;
import com.casestudy.nagraj.stockexchange.repo.StockExchangeRepository;

@Service
public interface StockExchangeService {
	
	public Iterable<StockExchangeDto> showAllExhanges();
	public StockExchangeDto addExchange(StockExchangeDto exchangeDto);
	public void removeExchange(StockExchangeDto exchangeDto);	

}
