package arrayex;
import java.util.Scanner;

public class Vowel {

	static java.util. Scanner scan=new java.util.Scanner  (System.in);
	public static void main(String[] args) {
		
		int size=scan.nextInt();
		char[] ch=new char[size];
		System.out.println("enter the values one by one ");
		for(int i=0;i<size;i++) {
			char ch1=scan.next().charAt(0);
		}
		int count=0;
		for(int i=0;i<=size;i++) {
		  switch(ch[i]) {
		  case 'a':
		  case 'A':
		  case 'e':
		  case 'E':
		  case  'i':
		  case  'I':
		  case  'o':
		  case  'O':
		  case  'u':
		  case  'U':
			  count++;
		 }
		}
		System.out.println(count);
	}
}