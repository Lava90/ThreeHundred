package com.lava.procedure;

public class Procedure061_Rectangle extends Procedure061_Shap {
	private double length;
	private double width;
	public Procedure061_Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width/2;
	}
}
