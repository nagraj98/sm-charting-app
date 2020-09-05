package com.casestudy.nagraj.company.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.nagraj.company.model.CompanyDto;
import com.casestudy.nagraj.company.model.IpoDto;
import com.casestudy.nagraj.company.service.CompanyService;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	
	@GetMapping("/companies/{name}")
	public CompanyDto getCompany(@PathVariable String name) throws Exception 
	{	
        return companyService.getCompany(name);
    }
	
	@GetMapping("/companies/stockprice/{companyId}&{fromDate}&{toDate}&{periodicity}")
	public List<Float> getStockPrice(@PathVariable long companyId,@PathVariable Date fromDate,@PathVariable Date toDate,@PathVariable int periodicity)throws Exception
    {
    	return companyService.getStockPrice(companyId,fromDate,toDate,periodicity);
    }
	
    @GetMapping("/companies/matchingcompany/{pattern}")
    public Iterable<CompanyDto> getMatchingCompanies(@PathVariable("pattern") String pattern) throws Exception
    {
    	return companyService.getMatchingCompanies(pattern);
    }
    
    @GetMapping("/companies/ipo/{name}")
    public  IpoDto getCompanyIpoDetails(@PathVariable String name) throws Exception
    {
    	return companyService.getCompanyIpoDetails(name);
    }

}
