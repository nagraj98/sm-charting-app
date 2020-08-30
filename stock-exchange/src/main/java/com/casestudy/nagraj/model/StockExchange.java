package com.casestudy.nagraj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StockExchange {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String exchangeId;
	private String name;
	private String brief;
	private String contactAddress;
	private String remarks;
	
	
	public StockExchange() {
		super();
	}

	public StockExchange(Integer id, String exchangeId, String name, String brief, String contactAddress, String remarks) {
		super();
		this.id = id;
		this.exchangeId = exchangeId;
		this.name = name;
		this.brief = brief;
		this.contactAddress = contactAddress;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExchangeId() {
		return exchangeId;
	}

	public void setExchangeId(String exchangeId) {
		this.exchangeId = exchangeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
