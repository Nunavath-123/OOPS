package arrayex;
import java.util.Scanner;
public class Stringreverse {
	public static void main(String[]args) {
		/*Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		String s=scan.next();
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println("reverse of a given string:"+rev);
	}
}*/
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the String");
		String str=scan.next();
		String sr="";
		for(int i=str.length()-1;i>=0;i--) {
			sr=sr+str.charAt(i);
		}
		System.out.println(sr);
	}
}
	
			