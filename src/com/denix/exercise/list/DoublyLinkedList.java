package com.denix.exercise.list;

public class DoublyLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;
	
	
	public void add(T value) {
		Node<T> node = new Node<>(value);
		
	    if(isEmpty()) {
	    	head = node;
	    	tail = node;
	    } else {
	    	tail.setNextRef(node);
	    	node.setPreviousRef(tail);
	    	tail = node;
	    }
	    size++;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void removeFirst() {
		if(!isEmpty()) {
			head = head.getNextRef();
		}
	}
	
	public void removeLast() {
		if(!isEmpty()){
			tail.getPreviousRef().setNextRef(null);
			tail = tail.getPreviousRef();
		}
	}
	
	
	
	
	private String getStringNode(Node<T> node) {
		
		if(node.getNextRef() == null) {
			return "FINAL = "+node.getValue();
		} else {
			return " [ "+(node.getPreviousRef() == null? "null": node.getPreviousRef().getValue())
					+" <-"+node.getValue()
					+" -> "+(node.getNextRef() ==null? "null":node.getNextRef().getValue())+"] ->" + getStringNode(node.getNextRef());
		}
	}
	
	public String toString() {
		if(isEmpty()) {
			return "[]";
		}
		
		return getStringNode(head);
	}
	
	
	public static void main(String[] args) {
		DoublyLinkedList<Integer> db = new DoublyLinkedList<>();
		
		db.add(5);
//		System.out.println(db.toString());
		db.add(10);
//		System.out.println(db.toString());
		db.add(30);
//		System.out.println(db.toString());
		db.add(1);
//		System.out.println(db.toString());
		db.add(2);
//		System.out.println(db.toString());
		
//		db.removeFirst();
//		db.removeFirst();
//		db.removeFirst();
//		db.removeFirst();
//		db.removeFirst();
//		db.removeFirst();
//	
		db.removeLast();
		db.removeLast();
		db.removeLast();
		System.out.println(db.toString());
	}
}
