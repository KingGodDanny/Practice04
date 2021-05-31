package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int p=0;
		
		int[] num = new int[6];
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45)+1; 
			
				 for(int x=0; x<i; x++) {
					if(num[i]!=num[i]) {
						p = num[i];
					}
					
				 }
				 System.out.print(num[i] + "	");
			}
			
					
		
	

	}

}
