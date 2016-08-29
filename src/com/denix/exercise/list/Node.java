package com.denix.exercise.list;

public class Node<T> {

	private Node<T> nextRef;
	private Node<T> previousRef;
	private T value;
	
	
	public Node(T value) {
		this.value = value;
	}
	
	public Node<T> getNextRef() {
		return nextRef;
	}
	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}
	public Node<T> getPreviousRef() {
		return previousRef;
	}
	public void setPreviousRef(Node<T> previousRef) {
		this.previousRef = previousRef;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	
	
	
}
