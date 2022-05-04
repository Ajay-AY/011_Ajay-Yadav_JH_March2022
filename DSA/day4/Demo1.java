	
	// Singly Linear LinkedList......................................
	
	/*
	 class Node{     					// Node class for creation of node ...................
	  
		  int data;
		  Node next;         					// another reference variable to hold address of next Node......
		  
		  Node(int data){
			  this.data = data;
			  this.next = null;
		  }
	 }*/
	 
	class Demo1{
		
	  Node head;      							// reference variable for head Node ...........
	  
	  //static inner class.............
	 static class Node{     					// Node class for creation of node ...................
	  
		  int data;
		  Node next;         					// another reference variable to hold address of next Node......
		  
		  Node(int data){
			  this.data = data;
			  this.next = null;
		  }
	 }
	 
	 // inserting at beginning........
	 void addFirst(int val){
		 Node newNode = new Node(val);
		 newNode.next = head;
		 head = newNode;
	 }
	 
	// inserting at middle........
	 void addMiddle(Node prev,int val){
		 
		 if(head==null)
			 System.out.println("Cannot insert...");
		 else{
			 Node newNode = new Node(val);
			 newNode.next = prev.next;
			 prev.next = newNode;
		 }
	 }
	 
	 //insert at pos....
	 
	 void position(int data,int pos){
		 Node newNode = new Node(data);
		 if(head==null){
			 head= newNode;
		 }
		 else if(pos<=1){
			 addFirst(data);
			 return;
		 }
		 else
		 {  
			 int i=1;
			 Node trav = head;
			 while(i<pos-1){
				 trav=trav.next;
				 i++;
			 }
			 newNode.next=trav.next;
			 trav.next = newNode;
		 }
		 
	 }
	 
	 
	 // inserting at end........
	 void addLast(int val){
		 Node newNode = new Node(val);
		 if(head==null)
			 head = newNode;
		 else{
			 Node tempNode = head;
			 while(tempNode.next!=null){
				 tempNode = tempNode.next;
			 }
			 tempNode.next = newNode;
		 }
	 }
	 
	  void delete(int key){
		  Node newNode=head;
		 

		  if(newNode.data == key && newNode.next == null){
			  newNode = null;
		  }

		  else{
			  Node temp = head;
			  while(temp.next!=null && temp.data != key){
				  newNode = temp;
				  temp = temp.next;
				  
			  }
			  
			  if(temp.next == null && temp.data != key){
				  System.out.println("Not found");
			  }
			  
			   if(newNode==null){
			  System.out.println("Not Found any element to delete ...:<");
				  return;
		  }  
			  newNode.next = temp.next;
			  }
			 
			  
		  }
		  
	 
	 
	 // displaying the data.........
	 
	 void display(){
		 Node temp = head;
		 while(temp!=null){
			 System.out.print(temp.data+" --> ");
			 temp = temp.next;
		 }
		 System.out.println();
		 
	 }
	
	
	public static void main(String[] args){
		
		Demo1 list = new Demo1();
		list.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		list.head.next = second;
		second.next = third;
		third.next = fourth;
	
		list.display();
	
		list.addFirst(11);
		list.addFirst(22);
		list.display();
		//inserted by passing node
		list.addMiddle(third,111);
		list.addLast(66);
		list.display();
		//inserted by passing position of node....
		list.position(1111,3);
		list.display();
	}
	
	}