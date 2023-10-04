package week3.day1;

public class Overridding extends Safari {

	public void Browser(int version) {
	    System.out.println(version);
	}
	public static void main(String[] args) {
		Overridding or=new Overridding();
		or.Browser(164);
	}
	
	
}
