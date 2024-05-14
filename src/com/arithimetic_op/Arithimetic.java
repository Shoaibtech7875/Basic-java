package com.arithimetic_op;

import java.util.Scanner;

public class Arithimetic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(" Enter First Number ");
		double num1 = scanner.nextDouble();

		System.out.println(" Enter Second Number");
		double num2 = scanner.nextDouble();

		double Addition = num1 + num2;
		double subtraction = num1 - num2;
		double multiplication = num1 * num2;
		double Devision = num1 / num2;
		double modules = num1 % num2;

		System.out.println("Sum:" + Addition);
		System.out.println("Subtraction : " + subtraction);
		System.out.println("multiplication : " + multiplication);
		System.out.println("Devision : " + Devision);
		System.out.println("modules" + modules);
	}

}
