/**
 * 
 */
package com.somesh.examples.staticex;


class Emp {
	int eid;
	int sal;
	static String ceo = "RAJ";
	
	static {
		String ab = "ab";
	}
	
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", sal=" + sal + ", ceo=" + ceo + "]";
	}

	public Emp(int eid, int sal) {
		super();
		this.eid = eid;
		this.sal = sal;
	}
	
}
/**
 * @author ksomalin
 *
 */
public class StaticDemo {

	
	public StaticDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(1,1000);
		Emp e2 = new Emp(2,2000);
		
	
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		

	}

}
