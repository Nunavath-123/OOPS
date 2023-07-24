package arrayex;
import java.util.Scanner;
public class Danger {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		String s=scan.next();
		String str="";
		int count=0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(str.charAt(i)==s.charAt(j)) 
					count++;
				}
		
			System.out.println(str.charAt(i)+count);
			}
	}
		}
	

			
	
		
	/*
	 * String name ="upendaar"; int count=0; char []ch=name.toCharArray(); for(int
	 * i=0;i<name.length();i++) { for(int j=i+1;j<name.length();j++) {
	 * if(ch[i]==ch[j]) { System.out.print(ch[j]);
	 * 
	 * }
	 * 
	 * } } } }
	 */
	
	
	
	