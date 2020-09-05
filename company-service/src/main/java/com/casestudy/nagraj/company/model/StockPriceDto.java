package com.casestudy.nagraj.company.model;

import java.sql.Date;
import java.sql.Time;

public class StockPriceDto {

	private String companyId;
	private String companyCode;
	private String stockExchange;
	private float currentPrice;
	private Date date;
	private Time time;
	
	public StockPriceDto() {
		super();
	}

	public StockPriceDto(String companyId, String companyCode, String stockExchange, float currentPrice, Date date,
			Time time) {
		super();
		this.companyId = companyId;
		this.companyCode = companyCode;
		this.stockExchange = stockExchange;
		this.currentPrice = currentPrice;
		this.date = date;
		this.time = time;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public float getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
}
