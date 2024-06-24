package com.java8Features_StreamAPI;

public class Employee implements Comparable<Employee> {
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

	@Override
	public String toString() {
		return "empId : " + empIdl + " EmpName : " + EmpName + ", sal : " + sal;
	}

	public static int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return (e1.getEmpIdl() < e2.getEmpIdl()) ? -1 : e1.getEmpIdl() == e2.getEmpIdl() ? 0 : 1;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return compare(this, o);
	}

	// which it will remove duplicates of employee by checking equals and hashcode
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empIdl;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		if (this.empIdl == e.empIdl) {
			return true;
		} else {
			return false;
		}
	}
}
