package com.casestudy.nagraj.company.model;

import java.util.Date;

public class IpoDto {

	private String name;
	private Float sharePrice;
	private Integer totalShare;
	private Date openDate;
	private String remarks;
	
	
	public IpoDto() {
		super();
	}


	public IpoDto(String name, Float sharePrice, Integer totalShare, Date openDate, String remarks) {
		super();
		this.name = name;
		this.sharePrice = sharePrice;
		this.totalShare = totalShare;
		this.openDate = openDate;
		this.remarks = remarks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Float getSharePrice() {
		return sharePrice;
	}


	public void setSharePrice(Float sharePrice) {
		this.sharePrice = sharePrice;
	}


	public Integer getTotalShare() {
		return totalShare;
	}


	public void setTotalShare(Integer totalShare) {
		this.totalShare = totalShare;
	}


	public Date getOpenDate() {
		return openDate;
	}


	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
