package linkedList;

public class MergeSortedList {

	public static Node mergeList(Node head1,Node head2){
		Node resHead=new Node(-1);
		Node retHead=resHead;
		if(head1==null)
			 return head2;
		if(head2==null)
			 return head1;
	   while(head1!=null && head2!=null)
	   {
		   
		   if(head1.data<head2.data){
			   resHead.next=head1;
			   head1=head1.next;
		   }
		   else{
			   resHead.next=head2;
			   head2=head2.next;
		   }
		   resHead=resHead.next;
	   }
		while(head1!=null)   {
		resHead.next=head1;
		head1=head1.next;
		}
		while(head2!=null)   {
			resHead.next=head2;
			head2=head2.next;
			}
		return retHead.next;
	}
	
	
	
	public static Node recursiveMerge(Node head1,Node head2){
		
		Node result=null;
		if(head1==null)
			 return head2;
		if(head2==null)
			 return head1;
	   
		   
		   if(head1.data<head2.data){
			   result=head1;
			  result.next=recursiveMerge(head1.next,head2);
		   }
		   else{
			   result=head2;
				  result.next=recursiveMerge(head1,head2.next);
		   }
		   return result;
	   }
	
	
	public static void main(String a[]){
		LinkedList ll=new LinkedList();
		Node head=null;
		//head=ll.push(head,10);
		head=ll.push(head,1);
		head=ll.push(head,3);
		head=ll.push(head,5);
		head=ll.push(head,6);
		head=ll.push(head,9);
		//head=ll.push(head,50);
		head=ll.push(head,33);
		    
		LinkedList l2=new LinkedList();
		Node head1=null;
		//head1=ll.push(head1,10);
		head1=ll.push(head1,2);
		head1=ll.push(head1,4);
		head1=ll.push(head1,5);
		head1=ll.push(head1,8);
		head1=ll.push(head1,10);
		head1=ll.push(head1,50);
		head1=ll.push(head1,57);
		   
		
		Node result=recursiveMerge(head, head1);
		
		  ll.display(result);
		    
	}
}
