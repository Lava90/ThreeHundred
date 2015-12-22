package com.lava.procedure;

public class Procedure027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		double a = 1;
		for (int i = 1; i <= 20; i++) {
			a = a / i;
			sum+=a;
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println(sum);
	}

}
