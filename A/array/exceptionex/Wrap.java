package exceptionex;
import java.util.*;

public class Wrap {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		String s1=scan.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			switch(ch) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				
				count++;
		   }
		}
			System.out.println(count);
	}
}