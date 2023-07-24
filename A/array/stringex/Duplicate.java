package stringex;

public class Duplicate {
	
	public static void main(String[] args) {
		
		String str="upendaarnunavath";
		int count=0;
		int length=str.length();
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("the duplicate characters :"+ch[j]);
					count++;
				}
			}
			
		}
		System.out.println(count);
		
	}

}
