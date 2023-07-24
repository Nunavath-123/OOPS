package stringex;

import java.util.Scanner;

public class Kalki {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		String str=scan.next();
		
		for(int i=0;i<str.length();i++) {
		
		char ch =str.charAt(i);
		
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
				break;
			}
		    System.out.println(ch);
		}
			
		
		
	}
}
		