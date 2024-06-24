package com.java8FeaturesCollectionEnhancement;

public class Employee {
	private int empIdl;
	private String EmpName;
	private double sal;

	public Employee(int empIdl, String empName, double sal) {
		super();
		this.empIdl = empIdl;
		EmpName = empName;
		this.sal = sal;
	}

	public int getEmpIdl() {
		return empIdl;
	}

	public void setEmpIdl(int empIdl) {
		this.empIdl = empIdl;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}
