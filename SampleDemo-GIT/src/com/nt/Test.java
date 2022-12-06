package com.nt;

import com.add.SumOfTwoNumber;
import com.checkpalendrom.CheckPalendrom;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("main executed");
		
		SumOfTwoNumber sum = new SumOfTwoNumber();
		int result=sum.add();
		System.out.println(result);
		
		CheckPalendrom check=new CheckPalendrom();
		String checkPlaendrom=check.palendrom(121);
		System.out.println(checkPlaendrom);
	}

}
