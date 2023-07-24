package stringex;

import java.util.Scanner;

public class Demo{
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		String s=scan.nextLine();
		int nS=0;
		int nD=0;
		int nA=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
				
				nA++;
			}
				else if(ch>=0||ch<=9) {
					
					nD++;
					
			}
				else {
					nS++;
				}
		}
		System.out.println("alphabets: "+nA);
		System.out.println("digits:"+nD);
		System.out.println("special characters: "+nS);
     }
			
			
}