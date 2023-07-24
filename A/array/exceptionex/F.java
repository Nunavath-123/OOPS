package exceptionex;
import java.util.Scanner;

public class F {

	public static void main(String[]args) {
		E[] obj=new E[5];
		obj[0]=new E(10);
		obj[1]=new E(20);
		obj[2]=new E(0);
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the a value");
		int a=scan.nextInt();
		System.out.println("enter the b value");
		int b=scan.nextInt();
		
	try {
			int c=obj[a].i/obj[b].i;
			System.out.println(c);
			}
	
        catch(ArithmeticException obj1) {
			System.out.println("Do not divide by 0");
		}
		catch(NullPointerException obj1) {
			System.out.println("reference having null value");
		}
		catch(ArrayIndexOutOfBoundsException obj1) {
			System.out.println("You have given out of index value");
		}
	finally {
		System.out.println("Thank you for using me and visit again");
	        }
	}
}

