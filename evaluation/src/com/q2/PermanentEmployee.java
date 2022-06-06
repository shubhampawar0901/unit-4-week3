package com.q2;

public class PermanentEmployee extends Employee {
	private double basicPay;
	
	public PermanentEmployee(int employeeId, String employeeName,double basicPay) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
//		salary = basicPay – PF amount;
	}

}
