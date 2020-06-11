package week1.day2;

import java.util.Arrays;

public class SecondAssignment3 {

	public static void main(String[] args) {
	
		  String text1 = "stops";
		  String text2 = "potss"; 
		  
		  if(text1.length()==text2.length())
		  {
			  	char[] text3= text1.toCharArray();
			  	char[] text4= text2.toCharArray();
			  	Arrays.sort(text3);
			  	Arrays.sort(text4);
			  	
			  	for(int i=0;i<text3.length;i++)
			  	{
			  		if(text3[i]==text4[i]) 
			  		{
			  			
			  			System.out.println("Both the Array value are equal  :  "+text3[i]+"="+text4[i]);
			  		}
			  		else 
					{
						System.out.println("Both the Array value are not equal");
					}
			
			    }
			  	
		  }
			  	
					
					else 
					{
						System.out.println("Given string Total is not matched");
					}
			
					  
		  

	}

}
