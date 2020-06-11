package week1.day2;

public class SecondAssignment2 {

	public static void main(String[] args) {
		String test = "changeme";
		
		char[]test1= test.toCharArray();
		
		for(int i=0;i<test1.length;i++) {
			
			if(i%2==1) 
			{
				char test2= Character.toUpperCase(test1[i]);
				System.out.println(test2);
				
		    }
			else {
				System.out.println(test1[i]);
			}
	}

}
}
