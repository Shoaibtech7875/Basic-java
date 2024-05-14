package com.interface1;

interface Bank1 {

	float rateOfIntrested();
}

class PNB implements Bank1 {

	public float rateOfIntrested() {
		return 10.15f;

	}

}

class SBI implements Bank1 {

	public float rateOfIntrested() {
		return 12.35f;
	}

}

public class Bank {
	public static void main(String[] args) {
		Bank1 bank1 = new PNB();
		System.out.println(" ROI : " + bank1.rateOfIntrested());

	}

}
