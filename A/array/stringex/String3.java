package stringex;
import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		String s=scan.nextLine();
		int  count=0;
	    for(int i=0;i<s.length();i++) {
	    	char ch=s.charAt(i);
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
	    	System.out.println("no of vowels present in the String:"+count);
	    }
	}
	    