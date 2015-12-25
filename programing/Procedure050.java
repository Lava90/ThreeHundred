package com.lava.procedure;

import java.util.Random;

public class Procedure050 {
	public static void main(String [] args){
		String [] str={"zhang","yan","instance"};
		for(int i=1;i<9;i++){
			new SellBook(str[new Random().nextInt(3)]);
		}
		SellBook.getCount();
	}
}
