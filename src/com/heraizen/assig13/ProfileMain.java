package com.heraizen.assig13;

public class ProfileMain {
	
//	static {
//		
//	}

	public static void main(String[] args) {
		profile_list p1 = new profile_list(1001, "Anand", "9658146496", 22, "anandpatra47@gmail.com");
		profile_list p2 = new profile_list(1002, "Raj", "9123520948", 24, "rajkumar@gmail.com");
		profile_list p3 = new profile_list(1051, "Lalit", "9658146243", 22, "lalit@gmail.com");
		profile_list p4 = new profile_list(1005, "Mainsh", "9123525345", 24, "manish@gmail.com");
		profile_list p5 = new profile_list(1006, "Tanmay", "9658144355", 22, "tanmay@gmail.com");
		profile_list p6 = new profile_list(1023, "Kaushik", "9123520426", 24, "kaushik@gmail.com");
		profile_list p7 = new profile_list(1034, "Swaraj", "9658146267", 22, "swaraj@gmail.com");
		profile_list p8 = new profile_list(1543, "Debi", "9123520725", 24, "debi@gmail.com");
		profile_list[] list = { p1, p2, p3, p4, p5, p6, p7, p8};
		profile_details pd = new profile_details();
		pd.start(list);

	}

}
