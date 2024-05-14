package com.array;

class Student {
	String name;
	int roll_no;

	public Student(String name, int roll_no) {
		super();
		this.name = name;
		this.roll_no = roll_no;
	}

}

public class Array_1 {
	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student("Shoaib", 181);
		arr[1] = new Student("yasir", 119);
		arr[2] = new Student("rizwan", 120);
		arr[3] = new Student("gufran", 121);
		arr[4] = new Student("rehan", 122);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(
					"Element at : " + i + "\n Student name : " + arr[i].name + "\n Roll No : " + arr[i].roll_no);

		}

	}

}
