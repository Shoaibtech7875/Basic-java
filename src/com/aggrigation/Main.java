package com.aggrigation;

public class Main {

	public static void main(String[] args) {
		
		Address address=new Address("Mumbai", "MH", 12);
		Employee employee=new Employee("shoaib", 123, 200000, address);
		employee.display();

	}

}
 