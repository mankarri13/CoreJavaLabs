package com.cg;
public class Entry{
	public static void main(String args[]){
		Date Emp1JoiningDate = new Date(12,12,2017);
		Date Emp2JoiningDate = new Date(16,8,2017);
		System.out.println("ID\tEMPLOYEE NAME\tGRADE\tSALARY\t\tJOINING DATE");
		System.out.println("-------------------------------------------------------------");
		Employee emp1 = new Employee("Harry","saigal",13161,"b",Emp1JoiningDate);
		Employee emp2 = new Employee("simran","mishra",13161,"a",Emp2JoiningDate);
		emp1.display();
		emp2.display();
		System.out.println("Number of Employees : " +Employee.getCount());
	}
}
