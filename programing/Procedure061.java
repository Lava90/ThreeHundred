package com.lava.procedure;

public class Procedure061 {
	public static void main(String[] args) {
		Procedure061_Shap pc=new Procedure061_Circle(3);
		Procedure061_Shap pr=new Procedure061_Rectangle(4,3);
		pc.getName();
		System.out.println(" "+pc.getArea());
		pr.getName();
		System.out.println(" "+pr.getArea());
	}
}
