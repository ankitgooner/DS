package linkedList;

public class ReverseLinkedList {
    public static Node reverseK(Node curr,int k){
    	
    	
    	Node prev=curr;
    	if(k==0 ||curr==null){
    		return prev;
    	
    }
    
        Node next=curr.next;
        curr.next=prev;
        curr=reverseK(next ,k-1);
        
        return curr;
}      
        		
	public static Node reverse(Node head){
		Node prev=null,curr=head;
		while(curr!=null){
		   
			
			
			
		
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
			//System.out.println(curr.data);
	        
		
		}
		
		
		return prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll=new LinkedList();
		Node head= null;
		
		   head=ll.push(head, 1);
		    head=ll.push(head, 3);
		    head=ll.push(head, 5);
		    head=ll.push(head, 6);
		    head=ll.push(head, 9);
		    head=ll.push(head, 50);
		    head=ll.push(head,33);
		    ll.display(head);
		    System.out.println("wait");
		   // head=reverse(head);
		    head=reverseK(head,2);
		    //System.out.println(ll.next);
		  ll.display(head);
		    
		    
	}

}
