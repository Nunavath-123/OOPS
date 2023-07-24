package arrayex;

public class Prime {
   public static void main(String[]args) {
	   int n=145;
	   int rem;
	   int sum=0;
	   int fact=1;
	   int temp=n;
	   while(n>0) {
		   rem=n%10;
		 sum=sum+rem;
		 n=n/10;
	   }
		 if(sum==temp) {
			 System.out.println(temp+"it is strong number");
		 }
			 else {
				 System.out.println(temp+"it is not a strong number");
				 }
        }
	   }
   

