package com.casestudy.nagraj.stockexchange.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.nagraj.stockexchange.model.StockExchange;

@Repository
public interface StockExchangeRepository extends JpaRepository<StockExchange, Integer>{

	Iterable<StockExchange> findByName(String name);
}
