package com.casestudy.nagraj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.nagraj.model.StockExchange;

@Repository
public interface StockExchangeRepository extends JpaRepository<StockExchange, Integer>{

}
