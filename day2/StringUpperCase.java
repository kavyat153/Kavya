package week3.day2;

public class StringUpperCase {

	public static void main(String[] args) {
		String name = "changeme";
		
		for (int i = 0;i<name.length();i++) {
        
		if(i % 2 ==0) {
        System.out.print(name.charAt(i));
	}
		else{
			System.out.print(name.toUpperCase().charAt(i));
			

}


	}
}
}
