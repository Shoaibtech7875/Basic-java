package com.oOps;

class Static1 {
	int rollno;
	String name;
	static String Collage_name = "APN collage";

	Static1(int r, String n) {

		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + Collage_name);
	}

}

public class Student {
	public static void main(String[] args) {
		Static1 static1 = new Static1(12, " shoaib");
		Static1 static12 = new Static1(13, " arhan");

		static1.display();
		static12.display();

	}
}
