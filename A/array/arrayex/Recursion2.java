package arrayex;

public class Recursion2 {

	public static void main(String[] args) {
		
		int fact=fact(4);
		System.out.println(fact);
	}

	private static int fact(int a) {
		
	if(a==0) {
		return 1;
	}
	else {
		return a*fact(a-1);
	}
		
		
	}
}