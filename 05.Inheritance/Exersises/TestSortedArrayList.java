package Exersises;

import java.util.ArrayList;

public class TestSortedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr1=new ArrayList<Integer>();
		arr1.add(3);
		arr1.add(1);
		arr1.add(6);
		arr1.add(2);
		SortedArrayList s1=new SortedArrayList<Integer>(arr1);
		
		System.out.println(s1.toString());
	}

}
