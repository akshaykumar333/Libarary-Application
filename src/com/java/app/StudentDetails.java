package com.java.app;

import java.util.HashMap;

public class StudentDetails {

	static HashMap<String, StudentSeperate> hashMapStudent = null;
	String callno;
	public StudentDetails() 
	{
		
	}
	public StudentDetails(String callno) 
	{
		this.callno= callno;
	}
	public StudentDetails(HashMap<String, StudentSeperate> hashMapStud) 
	{
		this.hashMapStudent = hashMapStud;
	}
	public HashMap<String, StudentSeperate> takeAddressofStudentDetails()
	{
		return hashMapStudent;
	}
	public String getCallNo()
	{
		return callno;
	}
	public String toString()
	{
		return callno;
	}
	public static void main(String...student) 
	{
		StudentDetails sd = new StudentDetails(student[0]);
		if(hashMapStudent == null)
		{
			hashMapStudent = new HashMap();
		}
		hashMapStudent.put(sd.getCallNo(), new StudentSeperate(student[0], student[1], student[2], student[3]));
		new StudentDetails(hashMapStudent);
	}

}
