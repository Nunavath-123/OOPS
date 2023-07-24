package arrayex;

import java.util.Scanner;

public class Duplicate1 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the String");
		String s=scan.next();
		String empty="";
		for(int i=0;i<=s.length();i++) {
			char ch=s.charAt(i);
		
			if(empty.indexOf(i)==-1) {
				empty=empty+ch;
			}
		
		
	}
		System.out.println(empty);
	}
}
	
	/*public static void main(String []args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the String");
		String str=scan.next();
		String empty="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(empty.indexOf(i)==-1) {
				empty=empty+ch;
			}
		}
		System.out.println(empty);
	}
}

*/