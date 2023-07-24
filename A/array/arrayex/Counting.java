package arrayex;

public class Counting {

	public static void main(String[] args) {
		int n=8526;
		int temp=n;
		int rem;
		int res=0;
		while(n>0) {
			rem=n%10;
			res=res*10+rem;
			n=n/10;
		}
		if(temp==res) {
		System.out.println(res);
	}
		else {
			System.out.println("it is not a plindrome "+res);
		}

}
}
