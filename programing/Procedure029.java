package com.lava.procedure;
/*
 * 使用标签退出多重循环。
 */
public class Procedure029 {
	public static void main(String []args){
		case1:
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				System.out.print("haha ");
				if(j==2){
					break case1;
				}
			}
			System.out.println();
			System.out.print("**");
		}
	}
}
