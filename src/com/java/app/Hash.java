package com.java.app;

import java.util.HashMap;

import javax.swing.JFrame;

public class Hash extends JFrame {
	static HashMap<String ,LibrarianDetails> h1 = null;
	String name;
	String pass;
	String email;
	String contact;
	public Hash()
	{
		
	}
	public Hash( HashMap<String, LibrarianDetails>  h)
	{
		h1 = h;
	}
	public Hash(String a)
	{
		name = a;
	}
	public String getName()
	{
		return name;
	}
	public  HashMap<String, LibrarianDetails> getAddressOfHashMapObject()
	{
		return h1;
	}
		

	
	
	public static void main(String...data) {

		Hash hashObj = new Hash(data[0]);
		String key = data[0];
		
		int val = Integer.parseInt(data[1]);
		if(h1 == null)
			
			h1 = new HashMap<String, LibrarianDetails>();
		
		h1.put(hashObj.getName(),  new LibrarianDetails(data[0], data[1], data[2], data[3], data[4]));
		new Hash(h1);
		
		
		
	}

}
