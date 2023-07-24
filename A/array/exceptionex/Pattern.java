package exceptionex;



public class Pattern {

	public static void main(String[] args) {
	  int i=10;
		Integer i1=new Integer(10);
		System.out.println(i1);
		System.out.println(i==i1);
		System.out.println(i1.toString());
		System.out.println(i1.equals(i1));
		
		int j=20;
		Integer i2=Integer.valueOf(i);
		System.out.println(i2.equals(i2));
		
		Integer i3=40;
		System.out.println(i3.toString());
		System.out.println(i3);
		
		Integer i4=50;
		Integer i5=60;
		System.out.println(i4==i5);
		System.out.println(i4.equals(i5));
		System.out.println(i4.hashCode());
		System.out.println(i5.hashCode());
		
		Character ch='a';
		System.out.println(ch);
	}
}