package com.hoteles.certifications.model;

public class RoomModel {
	private String room;
	private String adults;
	private String children;
	
	public RoomModel(String Room, String Adults, String children) {
		this.room = Room;
		this.adults = Adults;
		this.children = children;
	}
	
	public String getRoom() {
		
		return room;
	}
	public String getAdult() {
		
		return adults;
	}
	public String getChildren() {
		
		return children;
	}
	public void setRoom(String Room) {
		this.room = Room;
	}
	public void setAdult(String Adults) {
		this.adults= Adults;
	}
	public void setChildren(String children) {
		this.children = children;
	}
}
