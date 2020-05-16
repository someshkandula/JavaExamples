/**
 * 
 */
package com.somesh.examples.linkedlistex;

/**
 * @author ksomalin
 *
 */
public class Node {
	Object data;
	Node next;

	public Node(Object data) {
		super();
		this.data = data;
		this.next = null;
	}

	public Node(Object data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(int data) {
		this.data = data;
	}
}
