package com.casestudy.nagraj.stockprice.model;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StockPrice {

	private Integer id;
	private double stockPrice;
	private String date; // "dd-mm-yyyy"
	private String time; // "hh:mm:ss"
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="companyCode")
	private Company company;
	
//	@Basic
//	private java.sql.Date date;
//	
//	@Basic
//	private java.sql.Time Time;
}
