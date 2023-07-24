package stringex;
import java.util.Scanner;

public class Threevalues {

	public static void main(String[] args) {
		int nA=0,nS=0,nN=0;
		char ch;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		String s=scan.nextLine();
		
		for(int i=0;i<s.length();i++) {
			  ch=s.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
				nA++;
			}
			else if(ch>='0' && ch<='9') {
				nN++;
			}
			else {
				nS++;
			}
		}
		System.out.println("the no of digits present in the String:"+nA);
		System.out.println("the no of Special Characters present in the String:"+nN);
		System.out.println("the no of Alphabets present in the String:"+nS);
	}
}
		

	


