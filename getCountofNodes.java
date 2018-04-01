// Java program to count number of nodes in a linked list

/* Linked list Node*/
class Node
{
	int data;
	Node next;
	Node(int d) {
	 data = d; 
	 next = null; }
}

// Linked List class
class LinkedList
{
	Node head; // head of list

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);

		new_node.next = head;
		head = new_node;
	}

	/* Returns count of nodes in linked list */
	public int getCount()
	{
		Node temp = head;
		int count = 0;
		while (temp != null)
		{
			count++;
			temp = temp.next;
		}
		return count;
	}


	public boolean search(Node head, int x)
	{
		Node current = head;
		while(current!=null) {
			if(current.data==x) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public int getNthNode(int x) {

		Node current = head;
		for(int i=0; i<x; i++) {
			current = current.next;
		}
		return current.data;
	}

	public int getFreqOfItem(int x) {
		int count = 0;
		Node current = head;

		while(current != null) {
			if(current.data ==x) {
				count += 1;
			}
			current = current.next;
		}
		return count;
	}

	public int getNthNodeFromTail(int x) {
		

	}
	public static void main(String[] args)
	{
		/* Start with the empty list */
		LinkedList llist = new LinkedList();
		int n = 1;
		llist.push(1);
		llist.push(3);
		llist.push(1);
		llist.push(2);
		llist.push(1);

		System.out.println("Count of nodes is " +
						llist.getCount());

		System.out.println(llist.search(llist.head, 2));

		System.out.println("Node in link list at. position " + n + " is "  + llist.getNthNode(n));

		System.out.println("Number " + n + " is occured in link list  " + llist.getFreqOfItem(n) + " Times.");
	}
}

