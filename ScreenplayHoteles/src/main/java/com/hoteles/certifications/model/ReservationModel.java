package com.hoteles.certifications.model;

public class ReservationModel {
	private String name;
	private String surname;
	private String email;
	private String phone;
	private String card;
	private String nameCard;
	private String surnameCard;
	private String numbreCard;
	private String month;
	private String year;
	
	public ReservationModel(String name, String surname, String email, String phone, String card, String name_card, String surname_card, String code, String month, String year) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
		this.card = card;
		this.nameCard = name_card;
		this.surnameCard = surname_card;
		this.numbreCard = code;
		this.month = month;
		this.year = year;		
	}
	public String getName() {
		
		return name;
	}
	public String getSurname() {
		
		return surname;
	}
	public String getEmail() {
		
		return email;
	}
	public String getPhone() {
		
		return phone;
	}
	public String getCard() {
		
		return card;
	}
	public String getNameCard() {
		
		return nameCard;
	}
	public String getSurnameCard() {
		
		return surnameCard;
	}
	public String getCode() {
		
		return numbreCard;
	}	
	public String getMonth() {
		
		return month;
	}
	public String getYear() {
		
		return year;
	}
	
	
	public void setName(String name) {
		
		this.name = name;
	}
	public void setSurname(String surname) {
		
		this.surname = surname;
	}
	public void setEmail(String email) {
		
		this.email = email;
	}
	public void setPhone(String phone) {
		
		this.phone = phone;
	}
	public void setCard(String card) {
		
		this.card = card;
	}
	public void setNameCard(String name_card) {
		
		this.nameCard = name_card;
	}
	public void setSurnameCard(String surname_card) {
		
		this.surnameCard = surname_card;
	}
	public void setCode(String code) {
		
		this.numbreCard = code;
	}	
	public void setMonth(String month) {
		
		this.month = month;
	}
	public void setYear(String year) {
		
		this.year = year;
	}
		 
}