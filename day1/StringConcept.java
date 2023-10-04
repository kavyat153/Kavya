package week3.day1;

public class StringConcept {

	public static void main(String[] args) {
		int chr=0;
		String CompName="Test Leaf";
		char[] charArray = CompName.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]=='e') {
				chr++;
				
			}
			
			
		}
		
System.out.println("Num of e:"+chr);
	}

}
