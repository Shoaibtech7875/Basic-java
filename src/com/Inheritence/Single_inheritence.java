package com.Inheritence;

class Programmar {
	float salary = 25000;

}

public class Single_inheritence extends Programmar {
	int bonus = 10000;

	public static void main(String[] args) {

		Single_inheritence single_inheritence = new Single_inheritence();
		System.out.println("Programmar Salary is :" + single_inheritence.salary);
		System.out.println("Programmar Salary is :" + single_inheritence.bonus);
	}

}
