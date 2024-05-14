package com.aggrigation;

public class Employee {

	String Ep_name;
	int Ep_id;
	double Salary;
	Address adds;
	public Employee(String en, int epid, double s, Address a) {
		
		Ep_name = en;
		Ep_id = epid;
		Salary = s;
		adds = a;
	}
	
	
	@Override
	public String toString() {
		return "Employee [ Ep_id=" + Ep_id + ", Salary=" + Salary + ", adds=" + adds + "]";
	}


	public void  display(){
		
		System.out.println(Ep_name+" "+Ep_id+" "+Salary+" "+adds.city+" "+adds.state+" "+adds.room_no);
		
	}
	
}
