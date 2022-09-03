package com.labday;

import java.util.ArrayList;

public class sumOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(7);
		a1.add(16);
		a1.add(9);
		a1.add(10);
		a1.add(38);
		a1.add(20);
		
		int res1=a1.stream().filter(i->i%2!=0).reduce(0,(i,j)->i+j);   //To store sum of odd no.s 
		System.out.println(res1);
	}

}
