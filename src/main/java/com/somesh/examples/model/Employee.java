package com.somesh.examples.model;

import java.io.Serializable;

public class Employee implements Serializable{

	private String empid;
	private String name;
	private String dept;
	
	public Employee() {
	}

	public Employee(String empid, String name, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
	}

	public String getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	

}
