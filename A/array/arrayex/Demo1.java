package arrayex;
import java.util.Scanner;
public class Demo1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String :");
		String str=scan.next();
		String sr=" ";
		for(int i=0;i<str.length();i++) {
			sr=str.charAt(i)+sr;
		}
		System.out.println(sr);
	}
	}