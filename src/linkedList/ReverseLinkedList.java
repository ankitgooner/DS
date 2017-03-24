package linkedList;

public class ReverseLinkedList {

	public static Node reverse(Node head){
		Node prev=null,curr=head;
		while(curr.next!=null){
		   
			
			Node temp=curr;
			
		
			Node next=curr.next;
			curr.next=prev;
			prev=temp;
			curr=next;
			
			//System.out.println(curr.data);
	        
		
		}
		if(curr.next==null)curr.next=prev;
		
		return curr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head= new Node(10);
		
		    head.push(head, 1);
		    head.push(head, 3);
		    head.push(head, 5);
		    head.push(head, 6);
		    head.push(head, 9);
		    head.push(head, 50);
		    head.push(head,33);
		    head.display(head);
		    System.out.println("wait");
		    head=reverse(head);
		    //System.out.println(head.next);
		  head.display(head);
		    
		    
	}

}
