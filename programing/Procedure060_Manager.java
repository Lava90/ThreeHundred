package com.lava.procedure;

public class Procedure060_Manager extends Procedure060_Employee {
	private String info;
	private double extra;
	@Override
	public void setInfo(String info){
		this.info=info;
	}

	public double getExtra() {
		return extra;
	}
	public void setExtra(double extra) {
		this.extra = extra;
	}
	public String getInfo() {
		return info;
	}
	
	
}
