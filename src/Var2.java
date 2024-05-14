
public class Var2 {

	int x = 0;

	public int sum(int... a) {
		for (int i = 0; i < a.length; i++) {
			x += a[i];
		}
		return x;
	}

	public static void main(String[] args) {
		Var2 v1 = new Var2();

		int a = v1.sum(23, 43, 2, 5);
		System.out.println(a);
	}

}
