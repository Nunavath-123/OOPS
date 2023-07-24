package arrayex;

import java.util.Scanner;

public class Stringl {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int size=scan.nextInt();
    char ch[]=new char[size];
    System.out.println("enter the value one by one");
    for(int i=0;i<size;i++) {
    	ch[i]=scan.next().charAt(0);
    }
    int count=0;
    for(int i=0;i<=size;i++) {
    	switch(ch[i]) {
    	
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
    		
    }
  }
    System.out.println("the no of vowels present in an aray"+count);
  }
}  
    