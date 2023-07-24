package exceptionex;

public class Wrapper1 {

	public static void main(String[] args) {
		int i=10;
		
		Integer i1=new Integer(i);
		System.out.println(i1);
		System.out.println(i1.toString());
		System.out.println(i==i1);
		System.out.println(i1.equals(i));
		int j=20;
		Integer i2=new Integer(j);
		System.out.println(i2.valueOf(i2));
		System.out.println(i2==i1);
		int k=30;
		Integer i4=new Integer(30);
		System.out.println(i4.hashCode());
		char ch='a';
		Character ch1=new Character(ch);
		System.out.println(ch1);
		Long l=1234l;
		Long l1=new Long(1234l);
		System.out.println(l1);
		System.out.println(l1.equals(i4));
	
		
	}
}


	