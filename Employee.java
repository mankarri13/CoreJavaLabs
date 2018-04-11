package com.cg;
public class Employee {
	
	String firstName, lastName;
	double salary;
	String grade;
	Date joiningDate;
	int id;
	static int count;
	
	public Employee(String firstName, String lastName, double salary, String grade, Date joiningDate){
		id = ++count;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.grade = grade;
		this.joiningDate = joiningDate;
		
	}
	
	public void display(){
		System.out.println(id+ "\t" +firstName+ " " +lastName+ "\t  " +grade+ "\t " +salary+ "\t  " +joiningDate);
	}
	
	public static int getCount(){
		return count;
	}
	
}

