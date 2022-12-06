package com.checkpalendrom;

public class CheckPalendrom {
	
	int rev;
	
	public String palendrom(int n) {
		int m=n;
		while(m!=0) {
			int r=m%10;
		 rev=rev*10+r;
		 m=m/10;
		}
		if(n==rev)
			return "Palendrom";
		else
			return "Not a Palendrom";
	}

}
