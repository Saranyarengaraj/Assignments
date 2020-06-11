package week1.day2;


public class FirstAssignment1 {

	public static void main(String[] args) {
		String assignment1 = "I am a software tester";
		String rev = "";
		String[] store = assignment1.split(" ");
		for(int i=0;i<store.length;i++) {
		
			if(i%2==1) {
				char[] storeNew = store[i].toCharArray();
				for(int j=storeNew.length;j>0;j--) {
					
					 rev = rev + storeNew[j-1];
				}
				
				System.out.println(rev);
			}
			else {
			 System.out.println(store[i]);
			
			}
			
			
	}
		
		
		
}

}
