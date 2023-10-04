package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		int[] array1={3, 2, 11, 4, 6, 7};
		int[] array2= {1, 2, 8, 4, 9, 7};
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
	    for (int number: array1) {
			list1.add(number);
		}

	    for (int number: array2) {
	    	list2.add(number);
	    
	    }
	    
	    List<Integer> intersection=new ArrayList<Integer>(list1);
	    intersection.retainAll(list2);
	    System.out.println(intersection);
	    
	    
	    
	    
	    
	    
	}
	

}
