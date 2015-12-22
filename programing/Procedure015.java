package com.lava.procedure;

public class Procedure015 {
	public static void main(String []args){
		String str="This is a test";
		char [] c=str.toCharArray();
		for(int i=0;i<c.length;i++){
			c[i]=(char)(c[i]^20000);
		}
		String newStr=String.valueOf(c);
		System.out.println(newStr);
		for(int i=0;i<c.length;i++){
			c[i]=(char)(c[i]^20000);
		}
		String newStr1=String.valueOf(c);
		System.out.println(newStr1);
		
	}
}
