package com.interface1;

interface Allaction {
	int show();

}

class Addition implements Allaction {

	public int show() {
		return 4 + 6;
	}

}

class Multiple implements Allaction {

	public int show() {
		return 4 * 6;
	}

}

class Devition implements Allaction {
	public int show() {
		return 9 / 5;
	}
}

public class methameticale {

	public static void main(String[] args) {

		Allaction allaction = new Addition();
		System.out.println("Addition : " + allaction.show());
		Allaction allaction1 = new Multiple();
		System.out.println("Multiple: " + allaction1.show());
		Allaction allaction2 = new Devition();
		System.out.println("Devition : " + allaction2.show());

	}

}
