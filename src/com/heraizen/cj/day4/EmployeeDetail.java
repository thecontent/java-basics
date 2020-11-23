package com.heraizen.cj.day4;


class Employee{
	float salary = 2000000;
	int id;
	String name; 
	Employee(int id,String name)
	{
		this.id = id;
		this.name = name;
		System.out.println("Id : "+id+" name : "+name+" salary : "+salary);
	}
	Employee(int id,String name,float sal)
	{
		this.id = id;
		this.name = name;
		this.salary = sal;
		System.out.println("Id : "+id+" name : "+name+" salary : "+salary);
	}
}

public class EmployeeDetail {

	public static void main(String[] args) {
		new Employee(10001,"Anand");
        new Employee(10002,"Chandan",1000000);
	}

}
