package com.chick.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Action {
	private String type;
	private String event;
	private String rootElement;
	private String effectElement;
	public Action() {
		super();
	}	
	public Action(String type, String event, String rootElement, String effectElement) {
		super();
		this.type = type;
		this.event = event;
		this.rootElement = rootElement;
		this.effectElement = effectElement;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getRootElement() {
		return rootElement;
	}
	public void setRootElement(String rootElement) {
		this.rootElement = rootElement;
	}
	public String getEffectElement() {
		return effectElement;
	}
	public void setEffectElement(String effectElement) {
		this.effectElement = effectElement;
	}
		
}
