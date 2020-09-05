package com.casestudy.nagraj.company.model;

import javax.persistence.*;

@Entity
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private float turnover;
	private String ceo;
	private String boardOfDirectors;
	private String listedIn; // listed in which stockexchanges.
	private String sector;
	private String briefWriteUp;
	private String stockCodes;
	
	
	public Company() {
		super();
	}


	public Company(Integer id, String name, float turnover, String ceo, String boardOfDirectors, String listedIn,
			String sector, String briefWriteUp, String stockCodes) {
		super();
		this.id = id;
		this.name = name;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.listedIn = listedIn;
		this.sector = sector;
		this.briefWriteUp = briefWriteUp;
		this.stockCodes = stockCodes;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getTurnover() {
		return turnover;
	}


	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}


	public String getCeo() {
		return ceo;
	}


	public void setCeo(String ceo) {
		this.ceo = ceo;
	}


	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}


	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}


	public String getListedIn() {
		return listedIn;
	}


	public void setListedIn(String listedIn) {
		this.listedIn = listedIn;
	}


	public String getSector() {
		return sector;
	}


	public void setSector(String sector) {
		this.sector = sector;
	}


	public String getBriefWriteUp() {
		return briefWriteUp;
	}


	public void setBriefWriteUp(String briefWriteUp) {
		this.briefWriteUp = briefWriteUp;
	}


	public String getStockCodes() {
		return stockCodes;
	}


	public void setStockCodes(String stockCodes) {
		this.stockCodes = stockCodes;
	}
	

}
