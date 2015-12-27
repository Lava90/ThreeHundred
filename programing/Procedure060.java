package com.lava.procedure;

public class Procedure060 {
	public static void main(String[] args) {
		Procedure060_Employee pro_emp = new Procedure060_Employee();
		pro_emp.setName("empolyee");
		pro_emp.setMoney(1000);
		pro_emp.setInfo("this is a  employee");
		Procedure060_Manager pro_man = new Procedure060_Manager();
		pro_man.setName("manager");
		pro_man.setMoney(1500);
		pro_man.setExtra(500);
		pro_man.setInfo("this is a manager");
		System.out.println("Employee's name" + pro_emp.getName());
		System.out.println("Employee's money" + pro_emp.getMoney());
		System.out.println("Employee's info" + pro_emp.getInfo());
		System.out.println("Manager's name" + pro_man.getName());
		System.out.println("Manager's money" + pro_man.getMoney());
		System.out.println("Manager's info" + pro_man.getInfo());
		System.out.println("Manager's extra" + pro_man.getExtra());
	}
}
