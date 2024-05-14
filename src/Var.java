

public class Var {
	int x = 0;
	public int sum(int...a) {
		for (int i = 0; i < a.length; i++) {
			x += a[i];
			
		}
		return x;
		
	}
	public static void main(String [] args) {
		Var var = new Var();
	int b = var.sum(1,2,3,4);
	System.out.println(b);
	}

}
