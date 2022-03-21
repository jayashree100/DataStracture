package com.bridgelab.datastracture;

public class SingleLinkedList {
	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;

		}
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("list is empty");
			return;
		}

		System.out.println("Single linked list");
		while (current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public void SearchNode(int data) {
		Node current = head;
		int i = 1;
		boolean flag = false;

		if (head == null) {
			System.out.println("list is Empty");
		} else {
			while (current != null) {
				if (current.data == data) {
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}

		}
		if (flag)
			System.out.println("Element is present in the list at the position:" + i);
		else
			System.out.println("Element not present in the list");
	}

	public void addFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	public void append(int data) {

	}

	public Node deleteFirst() {
		Node temp = head;
		head = head.next;
		return temp;
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			if (head != tail) {
				Node current = head;

				while (current.next != tail) {
					current = current.next;
				}
				tail = current;
				tail.next = null;
			}
			else {
				head = tail = null;
			}
		}
	}
	
    public void insertAfter(int data)
    {
        if (head == null)
        {
            System.out.println("list is empty");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head.next;
        head.next = newNode;
    }
}
