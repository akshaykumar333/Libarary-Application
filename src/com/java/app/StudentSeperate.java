package com.java.app;

public class StudentSeperate {

	String BookCln;
	String StudentId;
	String StudentName;
	String StudentContact;
	
	public StudentSeperate(String BookCln, String StudentId, String StudentName, String StudentContact)
	{
		this.BookCln=BookCln;
		this.StudentId=StudentId;
		this.StudentName=StudentName;
		this.StudentContact=StudentContact;
	}
	public String toString()
	{
		return BookCln+" "+StudentId+" "+StudentName+" "+StudentContact; 
	}
		
}


