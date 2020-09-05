package com.casestudy.nagraj.company.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.casestudy.nagraj.company.model.Company;

public interface CompanyRepository extends CrudRepository<Company, Integer>{
	
	Company findByName(String name);
	Iterable<Company> findByNameContaining(String pattern);
	@Query(value="select currentprice from stock where companyid=?1 and date between ?2 and ?3 and stockexchange=?4 order by date desc, time desc limit 1;", nativeQuery = true)
	float findByIdAndDateBetweenAndStockExchange(long id, Date fromDate, Date toDate, String stockExchange);

}
