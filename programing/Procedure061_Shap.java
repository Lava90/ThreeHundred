package com.lava.procedure;

public abstract class Procedure061_Shap {
	public void getName(){
		System.out.print(this.getClass().getSimpleName());
	}
	public abstract double getArea();
}
