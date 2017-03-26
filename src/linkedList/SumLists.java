package linkedList;

public class SumLists {
public static Node sumList(Node head1,Node head2){
	Node sumL=new Node(-1);Node temp=sumL;Node newNode;int carry=0;
	 while(head1!=null || head2!=null){
		 
		 int sum=((head1!=null)?head1.data:0)+((head2!=null)?head2.data:0)+carry;
		 carry=sum/10;int digit=sum%10;
		 
		 newNode=new Node(digit);
		 sumL.next=newNode;
		 sumL=sumL.next;
		 if(head1!=null)
		 head1=head1.next;
		 if(head2!=null)
		 head2=head2.next;
	 }
	
	 if(carry>0){
		  newNode=new Node(carry);
		 sumL.next=newNode;
		 sumL=sumL.next;
	 }
	return temp.next;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList ll=new LinkedList();
		Node head=null;
		//head=ll.push(head,10);
		head=ll.push(head,1);
		head=ll.push(head,3);
		head=ll.push(head,5);
		head=ll.push(head,6);
		head=ll.push(head,9);
		//head=ll.push(head,50);
		
		    
		LinkedList l2=new LinkedList();
		Node head1=null;
		//head1=ll.push(head1,10);
		head1=ll.push(head1,2);
		head1=ll.push(head1,4);
		head1=ll.push(head1,5);
		head1=ll.push(head1,8);
		
		Node p=sumList(head,head1);
		ll.display(p);
	}

       
}
