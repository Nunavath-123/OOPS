package arrayex;
import java.util.Scanner;
public class Upendar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		String s=scan.next();
		String str="";
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(str.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			
					System.out.println("the occurence of character"+count);
			}
		}
}
	
