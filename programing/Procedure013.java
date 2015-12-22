package com.lava.procedure;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;
public class Procedure013 {
	public static void main(String[] args) throws Exception {
/*		PrintStream out = System.out;
		PrintStream ps = new PrintStream("D:log.txt");
		System.setOut(ps);
		System.out.println("sdjfi");
		System.out.println("sdjfi");
		System.out.println("sdjfi");
		System.out.println("sdjfi");
		System.setOut(out);
		System.out.println("³É¹¦");*/
		
		InputStream is=new FileInputStream("D:log.txt");
		System.setIn(is);
		Scanner sc=new Scanner(System.in);
		String str="";
		while(sc.hasNext()){
			str=str+sc.nextLine()+"   ";
		}
		System.out.println(str);
	}
}
