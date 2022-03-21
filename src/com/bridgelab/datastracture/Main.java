package com.bridgelab.datastracture;

public class Main {

	public static void main(String[] args) {
		SingleLinkedList sl = new SingleLinkedList();
		//sl.addNode(56);
		//sl.addNode(30);
		//sl.addNode(70);
		sl.addFirst(70);
		sl.addFirst(30);
		sl.addFirst(56);
		
		sl.deleteFirst();
		sl.deleteLast();
		sl.insertAfter(40);
		
		sl.display();
		//sl.SearchNode(30);

	}

}
