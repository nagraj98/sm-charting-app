package com.casestudy.nagraj.company.service;

import java.lang.reflect.Type;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.nagraj.company.client.IpoClient;
import com.casestudy.nagraj.company.model.Company;
import com.casestudy.nagraj.company.model.CompanyDto;
import com.casestudy.nagraj.company.model.IpoDto;
import com.casestudy.nagraj.company.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyRepository companyRepo;
	
	@Autowired
	private IpoClient ipoClient;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public CompanyDto getCompany(String name) {
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return mapper.map(companyRepo.findByName(name), CompanyDto.class);
	}

	@Override
	public List<Float> getStockPrice(Long companyId, Date fromDate, Date toDate, int periodicity) {
		// TODO Auto-generated method stub
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		long Duration = toDate.getTime() - fromDate.getTime();
    	int days=(int) (TimeUnit.MILLISECONDS.toDays(Duration)+1);
    	List< Float >list=new ArrayList<Float>();
    	Date dt=fromDate;
    	Date dt1=fromDate;
    	int inc=days/periodicity;
    	int mod=days%periodicity;
    	for(int i=0;i<inc;i++)
    	{
    		fromDate.toLocalDate();
    		dt1=addDays(dt,periodicity-1);
    		list.add(companyRepo.findByIdAndDateBetweenAndStockExchange(companyId,dt,dt1,"BSE"));
    		dt=addDays(dt1,1);
    		
    	}
    	if(mod!=0)
    		list.add(companyRepo.findByIdAndDateBetweenAndStockExchange(companyId,dt,dt1,"BSE"));
    	
    	return list;
				
	}

	@Override
	public Iterable<CompanyDto> getMatchingCompanies(String pattern) {
		// TODO Auto-generated method stub
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Iterable<Company> list1 = companyRepo.findByNameContaining(pattern);
		
		Type target = new TypeToken<Iterable<CompanyDto>>(){}.getType();		
		return mapper.map(list1,target);
	}

	@Override
	public IpoDto getCompanyIpoDetails(String name) throws Exception 
	{
		// TODO Auto-generated method stub
		
		return ipoClient.getCompanyIpoDetails(name);

	}
	
	public static Date addDays(Date date, int days)
	{
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE , days);
		
		return new Date(c.getTimeInMillis());
	}

}
