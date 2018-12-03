package com.hoteles.certifications.model;

public class SearchModel {
	
	private String destination;
	
	public SearchModel(String destinations) {
		this.destination = destinations;
	}
	
	public String getDestination() {
		
		return destination;
	}
	public void setDestination(String destinations) {
		this.destination = destinations;

	}

}
