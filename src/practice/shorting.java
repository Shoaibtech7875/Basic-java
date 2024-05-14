package practice;

public class shorting {

	public static void main(String[] args) {
		int a[] = { 21, 32, 12, 11, 24, 21 };
		int temp;
		int j;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			j = i;
			while (j > 0 && a[j - 1] > temp) {
				a[j] = a[j - 1];
				j = j - 1;

			}
			a[j] = temp;

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
