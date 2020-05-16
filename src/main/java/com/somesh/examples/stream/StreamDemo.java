package com.somesh.examples.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {

	public StreamDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Map<String,List<Employee>> map = new HashMap<String, List<Employee>>();
		
		Employee e1 = new Employee("1","IT");
		Employee e2 = new Employee("2","IT");
		Employee e3 = new Employee("3","IT");
		
		Employee e4 = new Employee("4","Sales");
		Employee e5 = new Employee("5","Sales");
		Employee e6 = new Employee("6","Sales");
		
		//Employee object is added to List
		List inputList = new ArrayList<Employee>();
		inputList.add(e1);
		inputList.add(e2);
		inputList.add(e3);
		inputList.add(e4);
		inputList.add(e5);
		inputList.add(e6);
		
		//List is added to Map....  // To execute stream we need to get the List and employee object
		map.put("1",inputList);
		
		List<Employee> returnList = new ArrayList<Employee>();
		Set<String> keySet = map.keySet();
		
		for(String eid : keySet) {
			
			System.out.println("inside");
			returnList.addAll(map.get(eid).stream().filter(x -> x.dept.equalsIgnoreCase("IT")).collect(Collectors.toList()));
			
		}
		
		for(Employee val : returnList) {
			System.out.println("Value "+val.eid+" dept "+val.dept);
		}
		
		
	}

}

class Employee {
	
	String eid;
	String dept; 
	
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee(String eid, String dept) {
		super();
		this.eid = eid;
		this.dept = dept;
	}
	
	
}
