package com.java.app;

public class BookDetials {

	String call;
	String name;
	String author;
	String publisher;
	String quanity;
	
	public BookDetials() 
	{
		
	}
	public BookDetials(String call, String name, String author, String publisher, String quantity) 
	{
		this.call=call;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quanity=quantity;
	}
	public String toString()
	{
		return call+" "+name+" "+author+" "+publisher+" "+quanity;
	}

}
