package com.lava.procedure;

import java.util.*;

public class Procedure063 {
	public static void main(String[] args) {
		List<Procedure063_Employee> ls = new ArrayList<Procedure063_Employee>();
		ls.add(new Procedure063_Employee("zhang", 2));
		ls.add(new Procedure063_Employee("zhang", 1));
		ls.add(new Procedure063_Employee("zhang", 3));
		ls.add(new Procedure063_Employee("zhang", 4));
		for (Procedure063_Employee pe : ls) {
			System.out.println(pe);
		}
		System.out.println("--------------");
		Collections.sort(ls);
		for (Procedure063_Employee pe : ls) {
			System.out.println(pe);
		}

	}
}

class Procedure063_Employee implements Comparable<Procedure063_Employee> {
	private String name;
	private int age;

	public Procedure063_Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Procedure063_Employee o) {
		// TODO Auto-generated method stub
		if (age > o.age) {
			return 1;
		} else if (age < o.age) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ÐÕÃû" + name);
		sb.append("ÄêÁä" + age);
		return sb.toString();
	}
}
