package com.hoteles.certifications.model;

import java.util.Calendar;

public class HotelDateModel {
	private String departure;
	private String returno;
	
	public HotelDateModel(String departure, String datereturn) {
		this.departure = departure;
		this.returno = datereturn;
	}
	
	public String getDeparture() {
		
		return departure;
	}
	public String getDateReturn() {
		
		return returno;
	}
	
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public void setDateReturn(String datereturn) {
		this.returno = datereturn;
	}
}
