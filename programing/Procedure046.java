package com.lava.procedure;

public class Procedure046 {
	private static Procedure046 pro;
	private Procedure046(){
		
	}
	public static Procedure046 getInstance(){
		if(pro==null){
			return pro=new Procedure046();
		}else{
			return pro;
		}
	}
}
