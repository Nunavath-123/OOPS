package arrayex;

import java.util.Scanner;

class Unique{
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String ");
		String str=scan.nextLine();
		int nA=0,nS=0,nD=0;
		for(int i=0;i<=str.length();i++) {
			char ch=str.charAt(i);
			if((nA>='a'&&nA<='z')||(nA>='A'&&nA<='Z')) {
				nA++;
			}
			else if(nD>=0&&nD<=9) {
				nD++;
			}
			else
				nS++;
		}
		System.out.println("no of alphabets"+nA);
		System.out.println("no of digits"+nD);
		System.out.println("no of special characters"+nS);
	}
}
	
		