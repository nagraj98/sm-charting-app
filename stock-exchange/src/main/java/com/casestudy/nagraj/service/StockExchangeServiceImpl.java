package com.casestudy.nagraj.service;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.nagraj.model.StockExchange;
import com.casestudy.nagraj.model.StockExchangeDto;
import com.casestudy.nagraj.repo.StockExchangeRepository;
import com.google.common.reflect.TypeToken;

@Service
public class StockExchangeServiceImpl implements StockExchangeService {

	@Autowired
	private StockExchangeRepository stockExchangeRepo;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public List<StockExchangeDto> showAllExhanges() {
		Type target = new TypeToken<List<StockExchangeDto>>(){}.getType();
		return mapper.map(stockExchangeRepo.findAll(), target);
	}

	@Override
	public StockExchangeDto addExchange(StockExchangeDto exchangeDto) {
		stockExchangeRepo.save(mapper.map(exchangeDto , StockExchange.class));
		return exchangeDto;
	}

	@Override
	public void removeExchange(StockExchangeDto exchangeDto) {
		stockExchangeRepo.delete(mapper.map(exchangeDto , StockExchange.class));
	}
	

}
