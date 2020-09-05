package com.casestudy.nagraj.stockexchange.service;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.nagraj.stockexchange.model.StockExchange;
import com.casestudy.nagraj.stockexchange.model.StockExchangeDto;
import com.casestudy.nagraj.stockexchange.repo.StockExchangeRepository;

@Service
public class StockExchangeServiceImpl implements StockExchangeService {

	@Autowired
	private StockExchangeRepository stockExchangeRepo;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public Iterable<StockExchangeDto> showAllExhanges() {
		//mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Type target = new TypeToken<List<StockExchangeDto>>(){}.getType();
		return mapper.map(stockExchangeRepo.findAll(), target);
	}

	@Override
	public StockExchangeDto addExchange(StockExchangeDto exchangeDto) {
		//mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		stockExchangeRepo.save(mapper.map(exchangeDto , StockExchange.class));
		return exchangeDto;
	}

	@Override
	public void removeExchange(StockExchangeDto exchangeDto) {
		//mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		stockExchangeRepo.delete(mapper.map(exchangeDto , StockExchange.class));
	}


	

}
