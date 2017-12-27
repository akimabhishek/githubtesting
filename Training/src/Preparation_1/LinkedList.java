package Preparation_1;

public class LinkedList {
	
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
	
	void append (int data)
	{	
		Node new_node = new Node(data); 
		
		if (head == null)
		{
			head = new Node(data);
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
	
	void print ()
	{
		Node rtote = head;
		while(rtote!=null)
		{
			System.out.println(rtote.data);
			rtote = rtote.next;
		}
	}	
	
	 int count(Node temp)
	{
		if(temp==null)
			return 0;
		return 1+count(temp.next);
	}
	 
	 public int counthead(head)
	 {
		 return 1+count(head);
	 }
	
	public static void main(String[] args) {
		
		LinkedList llinkedlist = new LinkedList();
		llinkedlist.append(5);
		llinkedlist.push(6);
		llinkedlist.push(7);		
		llinkedlist.print();
		int n = count(head);
	}

}
