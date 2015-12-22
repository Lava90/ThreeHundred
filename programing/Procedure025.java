package com.lava.procedure;

public class Procedure025 {
	public static void main(String [] args){
		int  triangle [][] =new int [10][];	
		for(int i=0;i<triangle.length;i++){
			triangle[i]=new int [i+1];
			for(int j=0;j<=i;j++){
				if(i==0||j==0||i==j){
					triangle[i][j]=1;
				}else{
					triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];
				}
//				System.out.print(triangle[i][j]);
			}
		}
		for(int [] a: triangle){
			for(int k: a){
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
