package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		int[] array= {3, 2, 11, 4, 6, 7};
		List<Integer> list=new ArrayList<Integer>();
	     for (int data : array) {
	    	 list.add(data);
	     }
	     Collections.sort(list);
	     System.out.println(list);
         System.out.println(list.get(4));
	}

}
