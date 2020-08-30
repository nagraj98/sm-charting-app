package com.casestudy.nagraj.model;

public class StockExchangeDto {
	
	private String exchangeId;
	private String name;
	private String brief;
	private String contactAddress;
	private String remarks;
	
	
	public StockExchangeDto() {
		super();
	}

	public StockExchangeDto(String exchangeId, String name, String brief, String contactAddress, String remarks) {
		super();
		this.exchangeId = exchangeId;
		this.name = name;
		this.brief = brief;
		this.contactAddress = contactAddress;
		this.remarks = remarks;
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
