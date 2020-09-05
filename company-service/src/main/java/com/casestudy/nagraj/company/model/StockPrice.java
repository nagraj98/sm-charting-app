package com.casestudy.nagraj.company.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StockPrice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String companyId;
	private String companyCode;
	private String stockExchange;
	private float currentPrice;
	private Date date;
	private Time time;
	
	
	public StockPrice() {
		super();
	}


	public StockPrice(Integer id, String companyId, String companyCode, String stockExchange, float currentPrice,
			Date date, Time time) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.companyCode = companyCode;
		this.stockExchange = stockExchange;
		this.currentPrice = currentPrice;
		this.date = date;
		this.time = time;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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
