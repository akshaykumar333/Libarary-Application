package com.java.app;

import java.util.HashMap;

public class BookHash {

	static HashMap<String, BookDetials> hashBookDetails= null;
	String callno;
	public BookHash() 
	{
		
	}
	public BookHash(String callno) 
	{
		this.callno = callno;
	}
	public BookHash(HashMap<String, BookDetials> hashBoo) 
	{
		
	}
	public HashMap<String, BookDetials> takeAddressofBookDetails()
	{
		return hashBookDetails;
	}
	public String getCallNo()
	{
		return callno;
	}
	public String toString()
	{
		return callno;
	}
	public static void main(String...books) 
	{
		BookHash bh = new BookHash(books[0]);
		if(hashBookDetails == null)
		{
			hashBookDetails = new HashMap<String , BookDetials>();
		}
		hashBookDetails.put(bh.getCallNo(), new BookDetials(books[0], books[1], books[2], books[3], books[4]) );
		new BookHash(hashBookDetails);
		
	}

}
