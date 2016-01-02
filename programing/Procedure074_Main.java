package com.lava.procedure;

import java.lang.reflect.Field;

public class Procedure074_Main {
	public static void main(String [] args) throws Exception{
		Procedure074_Student stu=new Procedure074_Student();
		Class cla=stu.getClass();
		System.out.print("改动之前的ID： ");
		stu.getId();
		Field fie=cla.getDeclaredField("id");
		fie.setAccessible(true);
		fie.setInt(stu, 33);
		System.out.print("改动之后的ID： ");
		stu.getId();
		System.out.println("*******");
		System.out.print("改动之前的name： ");
		stu.getName();
		Field fie1=cla.getDeclaredField("name");
		fie1.setAccessible(true);
		fie1.set(stu,"zhangyan");
		System.out.print("改动之后的name： ");
		stu.getName();
		
	}
}
