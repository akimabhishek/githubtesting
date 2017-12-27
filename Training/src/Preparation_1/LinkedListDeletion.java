package Preparation_1;

public class LinkedListDeletion {
	
	Node head;
	
	class Node 
	{
		int data;
		Node next;
		
		Node (int d)
		{
			data = d;
			next = null;
		}
	}
	
	void append(int data)
	{
		Node new_node = new Node(data);
		if(head==null)
		{
			head = new_node;
			return;
		}		
		new_node.next = null;		
		Node last = head;
		while(last.next!=null)
		{
			last = last.next;
		}
		last.next = new_node;
		return;
		
	}
	
	void push(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	void delete(int data)
	{
		if(data==0)
			return;
		
	}
	
	public static void main(String[] args) {
		

	}

}
