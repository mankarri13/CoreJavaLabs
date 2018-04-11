package com.cg;

public class Date {
	
	private int day,month,year;
	public Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
 @Override
public String toString() {
	// TODO Auto-generated method stub
	 String formattedDate = day + "/" + month + "/" + year ;
	 return formattedDate;
}
}
