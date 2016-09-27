package com.chick.model.ab;

public abstract class File {
	
	public String size;
	public String location;
	public String typeF;
	public File() {
		super();		
	}
	public File(String size, String location, String typeF) {
		super();
		this.size = size;
		this.location = location;
		this.typeF = typeF;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTypeF() {
		return typeF;
	}
	public void setTypeF(String typeF) {
		this.typeF = typeF;
	}	
	
}
