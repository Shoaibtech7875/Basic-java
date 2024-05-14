import java.util.Scanner;

public class Ood_even {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		int num = scanner.nextInt();
		
		findEvenOdd(num);

	}

	public static void findEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(" Number is Even " + num);

		} else {
			System.out.println("Number is odd " + num);
		}

	}

}
