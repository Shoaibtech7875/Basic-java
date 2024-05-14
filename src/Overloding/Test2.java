package Overloding;

public class Test2 {
	static int sum(int a, int b) {
		return a + b;
	}

	static double sum2(double a, double b, double c) {
		return a * b + c;
	}

	public static void main(String[] args) {
		System.out.println(Test2.sum(12, 43));
		System.out.println(Test2.sum2(23, 54, 32));

	}

}
