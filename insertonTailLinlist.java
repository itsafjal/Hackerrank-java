/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method.
    Node x = new Node();
    x.data = data;
    x.next = null;
    if(head==null) {
        return x;
    }
    else{
        Node tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }
        tail.next = x;
    }
  return head;
}

