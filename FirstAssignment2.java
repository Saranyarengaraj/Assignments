package week1.day2;

public class FirstAssignment2 {

	public static void main(String[] args) {
		
		
		String string ="madam";
		String rev="";
		
		char[] string1=string.toCharArray();
		
		for(int i=string1.length;i>0;i--)
		{
		rev=rev+string1[i-1];
			
		}
		
		if(rev.equals(string)) {
			System.out.println("Given String is a Palindrome");
		}
		else {
			System.out.println("Given String is Not a Palindrome");	
		}
		

	}

}
