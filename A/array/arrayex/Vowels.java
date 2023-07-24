package arrayex;
import java.util.*;
public class Vowels {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		String s=scan.nextLine();
		int nA=0,nD=0,nS=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
				nA++;
			}
			else if((ch>=0 && ch<=9)){
				nD++;
			}
			else {
				nS++;
			}
		}
		System.out.println("the no of Alphabets in the given String:"+nA);
		System.out.println("the no of Digits in the given String:"+nD);
		System.out.println("the no of Special characters in the given String:"+nS);
	}
		
}
