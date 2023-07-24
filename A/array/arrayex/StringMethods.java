package arrayex;

public class StringMethods {

	public static void main(String[] args) {
	String s="upendar";
	int index=s.indexOf("ru");
	System.out.println(index);
	
   char [] index1=s.toCharArray();
		 for(char ch:index1) {
			 System.out.println(ch);
			 
			 
    System.out.println(s.indexOf("ar",3));
    System.out.println(s.indexOf('u'));
    String s2="a upendar b";
    System.out.println(s2.trim());
    
    String s4="welcome to goa";
    String[]a =s4.split(" ");
   System.out.println(s4.charAt(0));
		 }
	}
}