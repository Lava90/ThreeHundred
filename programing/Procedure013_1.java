package com.lava.procedure;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Procedure013_1 {
	public static void main(String []args) throws IOException{
//		PrintStream ps=new PrintStream("D:/out.txt");
//		PrintStream out=System.out;
//		System.setOut(ps);
//		System.out.println("nihao");
//		System.setOut(out);
//		System.out.println("success");
		
		InputStream is=new FileInputStream("D:/out.txt");
		System.setIn(is);
		Scanner sc=new Scanner(System.in);
		String str="";
		while(sc.hasNext()){
			str+=" "+sc.nextLine();
		}
		System.out.println(str);
		System.exit(0);
	}
}
