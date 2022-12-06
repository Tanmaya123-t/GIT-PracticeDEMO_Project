package com.nt;

import com.add.SumOfTwoNumber;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("main executed");
		
		SumOfTwoNumber sum = new SumOfTwoNumber();
		int result=sum.add();
		System.out.println(result);
	}

}
