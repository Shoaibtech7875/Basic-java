package Encapsulation;

public class Main {

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		encapsulation.setAccount_no(253467663633L);
		encapsulation.setHolder_name("Shoaib");
		encapsulation.setEmail("Shoaib3454@gmail.com");
		encapsulation.setAddress("Mumbai Mumbra");

		System.out.println("Account Number : " + encapsulation.getAccount_no() + "\n " + "Holder Number : "
				+ encapsulation.getHolder_name() + "\n " + "Email Id : " + encapsulation.getEmail() + " \n"
				+ "Address : " + encapsulation.getAddress());

	}

}
