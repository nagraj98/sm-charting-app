package com.casestudy.nagraj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.nagraj.model.StockExchange;
import com.casestudy.nagraj.model.StockExchangeDto;
import com.casestudy.nagraj.repo.StockExchangeRepository;

@Service
public interface StockExchangeService {
	
	public List<StockExchangeDto> showAllExhanges();
	public StockExchangeDto addExchange(StockExchangeDto exchangeDto);
	public void removeExchange(StockExchangeDto exchangeDto);	

}
