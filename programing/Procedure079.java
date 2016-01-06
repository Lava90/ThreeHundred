package com.lava.procedure;

import java.text.NumberFormat;
import java.util.*;

public class Procedure079 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("¿ªÊ¼£º");
		double number=sc.nextDouble();
		NumberFormat fn=NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println(fn.format(number));
		fn=NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(fn.format(number));
		System.exit(0);
	}
}
