package com.heraizen.cj.day4;
class Details{
	int pid;
	String  pname;
	String  price;
	Details(int pid,String pname,String price)
	{
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	void display()
	{
		System.out.println("pid = "+pid+" pname = "+pname+" price = "+price);
	}
}

public class ObjectArray {

	public static void main(String[] args) {
	Details d1 = new Details(1001,"boobalan","200000");
	Details d2 = new Details(1003,"raghul","200000");
	Details d3 = new Details(1045,"guna","200400");
	Details [] darr = {d1,d2,d3};
	
	for(Details arr :darr)
		{
			arr.display();
		}
	}

}
