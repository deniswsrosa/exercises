package com.denix.exercise.tree;

public class BinaryTree<T> {

	Node<T> rootNode;

	public void addNode(int key, T value) {

		Node<T> newNode = new Node<T>(key, value);

		if (rootNode == null) {
			rootNode = newNode;
			return;
		} else {
			addNode(rootNode, newNode);
		}
	}

	private void addNode(Node<T> target, Node<T> newNode) {

		if (target.leftChild == null) {
			target.leftChild = newNode;
		} else if (newNode.key < target.leftChild.key) {
			addNode(target.leftChild, newNode);
		} else if (target.rightChild == null) {
			target.rightChild = newNode;
		} else {
			addNode(target.rightChild, newNode);
		}

	}

	public String toString() {
		return rootNode.toString();
	}

	class Node<T> {
		int key;
		T value;

		Node<T> leftChild;
		Node<T> rightChild;

		public Node(int key, T value) {
			super();
			this.key = key;
			this.value = value;
		}

		public String toString() {
			return "Node " + key + " : " + value;
		}
	}

	public static void main(String[] args) {

		BinaryTree<String> theTree = new BinaryTree<>();

		theTree.addNode(50, "Boss");
		theTree.addNode(25, "Vice President");
		theTree.addNode(15, "Office Manager");
		theTree.addNode(30, "Secretary");
		theTree.addNode(75, "Sales Manager");

		theTree.addNode(85, "Salesman 1");

	}
}
