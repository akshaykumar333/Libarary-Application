package com.java.app;

public class LibrarianDetails 
{
	String name;
	String pass;
	String id;
	String email;
	String contactno;
	public LibrarianDetails() 
	{
		
	}
	public LibrarianDetails(String name , String pass, String id, String email, String contact)
	{
		this.name = name;
		this.pass = pass;
		this.id = id;
		this.email = email;
		this.contactno = contact;
	}
	public String toString()
	{
		return name+" "+pass+" "+id+" "+email+" "+contactno;
	}
	public static void main(String[] args) {
	

	}

}
