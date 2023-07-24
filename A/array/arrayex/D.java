package arrayex;

public class D {

	public static void main(String[] args) {
	      
		int p=100;
		int q=1000;
		
		for(int i=p;i<=q;i++) {
			int temp=i;
			int n=i;
			int res=0;
			int rem;
			
			while(n!=0) {
				rem=n%10;
				res=res+(rem*rem*rem);
				n=n/10;
			}
			if(res==temp) {
				System.out.println(res);
			}
			
			
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int p=100;
	       int q=999;
	       for(int i=p;i<=q;i++) {
	    	   int n=i;
	    	   int temp=n;
	    	   int rem;
	    	   int res=0;
	    	   while(n>0) {
	    		   rem=n%10;
	    		   res=res+(rem*rem*rem);
	    		   n=n/10;
	    	   }
	       
	    	   if(temp==res) {
	    		   System.out.println(res+ " ");
	    	   }
	       }
	}
}*/
