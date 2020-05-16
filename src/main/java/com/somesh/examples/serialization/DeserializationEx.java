package com.somesh.examples.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.somesh.examples.model.Employee;

public class DeserializationEx {

	public DeserializationEx() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fin = new FileInputStream("output.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		
		Employee e1 = (Employee) in.readObject();
		Employee e2 = (Employee) in.readObject();
		Employee e3 = (Employee) in.readObject();
		
		
		System.out.println(" obj1 ID: "+e1.getEmpid()+", Name: "+e1.getName()+", Dept: "+e1.getDept());
		System.out.println(" obj2 ID: "+e2.getEmpid()+", Name: "+e2.getName()+", Dept: "+e2.getDept());
		System.out.println(" obj3 ID: "+e3.getEmpid()+", Name: "+e3.getName()+", Dept: "+e3.getDept());
		
		in.close();
	}

}
