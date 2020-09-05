package com.casestudy.nagraj.company.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.casestudy.nagraj.company.model.IpoDto;

@FeignClient("IPO")
public interface IpoClient {

	@GetMapping("/companyipo/{name}")
	public IpoDto getCompanyIpoDetails(@PathVariable String name) throws Exception;
	
}
