package com.chick.model.object;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UserInterface {
	
	public String typeUI;
	public Image imageCover;
	public Image imageIcon;
	public String description;	
	public Action [] actionList;
	public UserInterface() {
		super();
	}	
	public UserInterface(String typeUI, Image imageCover, Image imageIcon, String description, Action[] actionList) {
		super();
		this.typeUI = typeUI;
		this.imageCover = imageCover;
		this.imageIcon = imageIcon;
		this.description = description;
		this.actionList = actionList;
	}
	public String getTypeUI() {
		return typeUI;
	}
	public void setTypeUI(String typeUI) {
		this.typeUI = typeUI;
	}
	public Image getImageCover() {
		return imageCover;
	}
	public void setImageCover(Image imageCover) {
		this.imageCover = imageCover;
	}
	public Image getImageIcon() {
		return imageIcon;
	}
	public void setImageIcon(Image imageIcon) {
		this.imageIcon = imageIcon;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Action[] getActionList() {
		return actionList;
	}
	public void setActionList(Action[] actionList) {
		this.actionList = actionList;
	}			
}
