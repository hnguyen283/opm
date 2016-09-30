package com.chick.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Data {
	Object detail;

	public Data() {
		super();
	}
	
	public Data(Object detail) {
		super();
		this.detail = detail;
	}

	public Object getDetail() {
		return detail;
	}

	public void setDetail(Object detail) {
		this.detail = detail;
	}

	
	
}
