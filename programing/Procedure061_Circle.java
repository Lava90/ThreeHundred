package com.lava.procedure;

public class Procedure061_Circle extends Procedure061_Shap {
	private double radius;
	public Procedure061_Circle(double radius){
		this.radius=radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
}
