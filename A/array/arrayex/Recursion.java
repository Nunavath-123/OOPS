package arrayex;

public class Recursion {

	public static void main(String[] args) {
		 int fact=fact(5);
		 System.out.println(fact);
	}
	public static int fact(int a) {
		if(a==0) {
			return 1;
		}
			else {
				return a*fact(a-1);
			}
		}
	}


