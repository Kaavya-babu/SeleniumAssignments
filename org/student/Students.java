package org.student;

public class Students {
	//Assignment 4
	public void studentInfo(int id)
	{
		System.out.println(id);
	}
	public void studentInfo(int id, String name)
	{
		System.out.println("Student id is "+id+" Student name is  " + name);
	}
	public void studentInfo(String email,int phone)
	{
		System.out.println("Student email is "+email+" Student phonenumber is  "+phone);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students sinfo=new Students();
		sinfo.studentInfo(218);
		sinfo.studentInfo(22, "kaavya");
		sinfo.studentInfo("kaavya@gmail.com", 75501);
		

	}

}
