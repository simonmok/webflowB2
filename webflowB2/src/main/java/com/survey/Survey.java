package com.survey;

import java.io.Serializable;

public class Survey implements Serializable {
	
	private static final long serialVersionUID = 1504527568495817078L;
	private String userName;
	private String hobby;
	private String language;
	
	public Survey() {
		
	}
	
	public Survey(String userName, String hobby, String language) {
		this.userName = userName;
		this.hobby = hobby;
		this.language = language;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
}