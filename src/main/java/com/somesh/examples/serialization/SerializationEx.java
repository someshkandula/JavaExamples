/**
 * 
 */
package com.somesh.examples.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.somesh.examples.model.Employee;

/**
 * @author ksomalin
 *
 */
public class SerializationEx {

	/**
	 * 
	 */
	public SerializationEx() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Employee e1 = new Employee("100", "Somesh", "10");
		Employee e2 = new Employee("101", "Rajesh", "20");
		Employee e3 = new Employee("102", "Suresh", "10");

		FileOutputStream fout = new FileOutputStream("output.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(e1);
		out.writeObject(e2);
		out.writeObject(e3);
		out.flush();

		out.close();
		System.out.println("Serialization and Deserialization is been successfully executed.");

	}

}
