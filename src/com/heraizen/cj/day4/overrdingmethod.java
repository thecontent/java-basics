package com.heraizen.cj.day4;

class EmployeeDet {
	String name = "";
	String Id = "";
	String salary = "";

	EmployeeDet(String name, String id, String salary) {
		this.name = name;
		this.Id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		System.out.println("Id = " + Id + " Name = " + name + " salary = " + salary);
		return "";
	}
}

public class overrdingmethod {

	public static void main(String[] args) {
		EmployeeDet em = new EmployeeDet("boobalan", "1001", "2000000");
		em.toString();
	}

}
