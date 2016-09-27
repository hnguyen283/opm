package com.chick.model.object;

public class Doc {
	private Doc parentDoc;
	private String docName;
	private UserInterface ui;
	private Data data;
	private Doc childDoc;
	public Doc() {
		super();
	}
	public Doc(Doc parentDoc, String docName, UserInterface ui, Data data, Doc childDoc) {
		super();
		this.parentDoc = parentDoc;
		this.docName = docName;
		this.ui = ui;
		this.data = data;
		this.childDoc = childDoc;
	}
	public Doc getParentDoc() {
		return parentDoc;
	}
	public void setParentDoc(Doc parentDoc) {
		this.parentDoc = parentDoc;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public UserInterface getUi() {
		return ui;
	}
	public void setUi(UserInterface ui) {
		this.ui = ui;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public Doc getChildDoc() {
		return childDoc;
	}
	public void setChildDoc(Doc childDoc) {
		this.childDoc = childDoc;
	}
	
	
}
