package com.chick.model.object;

import com.chick.model.ab.File;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Image extends File {
	String width;
	String height;	
	public Image() {
		super();
	}	
	public Image(String width, String height) {
		super();
		this.width = width;
		this.height = height;
	}

	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return super.getSize();
	}
	@Override
	public void setSize(String size) {
		// TODO Auto-generated method stub
		super.setSize(size);
	}
	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return super.getLocation();
	}
	@Override
	public void setLocation(String location) {
		// TODO Auto-generated method stub
		super.setLocation(location);
	}
	@Override
	public String getTypeF() {
		// TODO Auto-generated method stub
		return super.getTypeF();
	}
	@Override
	public void setTypeF(String typeF) {
		// TODO Auto-generated method stub
		super.setTypeF(typeF);
	}	
	
}
