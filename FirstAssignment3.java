package week1.day2;


public class FirstAssignment3 {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String Text4 = "";
		String[] newText=text.split(" ");
		
		for(int i=0;i<newText.length;i++) {
			
			while((newText[i]).equals("java")) {
				count = count +1;
				
				if(count>1) {
					Text4=text.replaceAll(newText[i], "");
					break;
				}
			}
			
		}
		System.out.println(Text4);
	}

}
