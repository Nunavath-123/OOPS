package exceptionex;

public class Unboxing {

	public static void main(String[] args) {
		Character ch='a';
		Character ch1=Character.valueOf('a');
		System.out.println(ch1);
		System.out.println(ch);
		
		char ch2='b';
		System.out.println(ch2);
		Character ch3=Character.valueOf('b');
		char ch4=ch3.charValue();
		System.out.println(ch4);
	    System.out.println(ch3);
		System.out.println(ch==ch2);
	}
}
		


