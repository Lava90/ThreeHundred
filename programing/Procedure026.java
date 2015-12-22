package com.lava.procedure;

public class Procedure026 {
	public static void main(String [] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"=");
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}
}
