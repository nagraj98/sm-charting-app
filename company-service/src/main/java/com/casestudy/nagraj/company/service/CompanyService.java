package com.casestudy.nagraj.company.service;

import java.sql.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.casestudy.nagraj.company.model.CompanyDto;
import com.casestudy.nagraj.company.model.IpoDto;

public interface CompanyService {

	public CompanyDto getCompany(String name);
	public List<Float> getStockPrice(Long companyId, Date fromDate, Date toDate, int periodicity);
	public Iterable<CompanyDto> getMatchingCompanies(String pattern);
	public IpoDto getCompanyIpoDetails(String name) throws Exception;
}

