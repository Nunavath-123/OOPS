package exceptionex;

public class Patterns {
	public static void main(String[]args) {
		int [][]a= {
				{1,2,3},
				{4,5,6},
				{6,7,6}
		};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("enter the transpose of matrix");
	   for(int i=0;i<3;i++) {
		   for(int j=0;j<3;j++) {
			   System.out.print(a[j][i]+ " ");
		   }
		   System.out.println();
	   }
}
}