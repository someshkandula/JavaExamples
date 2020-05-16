/**
 * 
 */
package com.somesh.examples.linkedlistex;

/**
 * @author ksomalin
 *
 */
public class LinkedListEx {

	private static int counter;
	private Node head;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node n1 = new Node(10);

	}

	public void add(Object data) {

		Node next = new Node(data);

		if (head == null) {
			head = next;
		}

		Node temp = next;
		Node current = head;

		if (current != null) {
			while (current.next != null) {
				current = current.next;
			}
			current.setNext(temp);
		}
		incrementCounter();

	}

	private void incrementCounter() {
		counter++;
	}

	private void decrementCounter() {
		counter--;
	}

	private int getCounter() {
		return counter;
	}

	public Object get(int index) {

		if (index < 0)
			return null;

		Node current = head.getNext();

		if (current != null && index < counter) {

			for (int i = 0; i <= index; i++) {
				current = current.getNext();
				if (current == null) {
					return null;
				}

			}
			return current.getData();

		}
		return null;

	}

	public void remove(int index) {

		Node current = head.getNext();

		if (current != null) {

			for (int i = 0; i <= index; i++) {
				current = current.getNext();
			}
			if (current != null) {
				current.setNext(current.getNext().getNext());
			}

		}
	}

}
