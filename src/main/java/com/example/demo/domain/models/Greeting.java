package com.example.demo.domain.models;

public class Greeting {
	private String content;

	public Greeting() {
		super();
	}

	
	public Greeting(String message) {
		this.content = message;
	}
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
