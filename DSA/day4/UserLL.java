	import java.util.Scanner;
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
	 
	class UserLL{
		
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
			 while(i<pos-1 && trav.next!=null){
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
		  Node temp=head;
		 Node prev = null;
         //if sigle element...
		  if(temp.data == key && temp!= null){
			  head = temp.next;
			  return;
		  }
		  
		 
            // traverse 
		
					  
					  while(temp.next!=null && temp.data != key){
						 prev = temp;
						  temp = temp.next;
						  
					  }
					  if(temp==null)
						  return;
					 
					
					  
					  prev.next = temp.next;
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
		int val = 0;
		int flag = 0;
		int post =0;
		UserLL list = new UserLL();
		Scanner sc = new Scanner(System.in);
		while(flag!=1){
		System.out.println("Enter choice :\n 1)Add at first element \t\t4)Delete \t\t5) Display \t\t6) Exit  \n2) Add at position   \n3)add at last   ");
		int d = sc.nextInt();
		switch(d){
	
		case 1 :{
			System.out.println("Enter value");
			val = sc.nextInt();
			list.addFirst(val);
		};break;
		case 2 :{
			System.out.println("Enter position");
			post = sc.nextInt();
			System.out.println("Enter value");
			val = sc.nextInt();
			list.position(post, val);
		};break;
		case 3 :{
			System.out.println("Enter value");
			val = sc.nextInt();
			list.addLast(val);
		};break;
		case 4 :{
			System.out.println("Enter value");
			val = sc.nextInt();
			list.delete(val);
		};break;
		
		case 5:{
			list.display();
		};break;
		
		case 6 :{
			flag =1;
			System.out.println("Succesfully exited");}
		}
	}
 }
	
	}