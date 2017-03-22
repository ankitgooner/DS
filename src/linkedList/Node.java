package linkedList;

public class Node {

	Node next;
	int data;
	
	Node(int data){
		next=null;
		this.data=data;
	}
	
	void push(Node head,int data){
		
		Node newNode=new Node(data);
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newNode;
		
		
		
	}
	void display(Node head){
		
		while(head!=null){
			
			System.out.println(head.data);
			head=head.next;
		}
	}
	int lengthFinder(Node head){
		
		if(head==null)
		return 0;
		
		else 
			return 1+lengthFinder(head.next);
		
		
	}
	
	void swap(Node head,int a,int b){
		boolean founda=false,foundb=false,isAhead=false,isBhead=false;Node tempa=null,tempb=null;
		Node temp=head;
		if(head.data==a){isAhead=true;tempa=head;};
		if(head.data==b){isBhead=true;tempb=head;}
		//System.out.println(head.next.data);
		while(temp.next!=null){
			
			if(temp.next.data==a){
				founda=true;
				 tempa=temp;
			}
			
			if(temp.next.data==b){
				foundb=true;
				 tempb=temp;
			}
			
			temp=temp.next;
		}
		if(founda&&foundb){
			//System.out.println(tempa.data+ " "+tempb.data);
			Node tempAttachB,tempAttachA,tempAttachNextB,tempAttachNextA;
			tempAttachB=tempb.next;
			tempAttachA=tempa.next;
			
			tempAttachNextB=tempb.next.next;
			tempAttachNextA=tempa.next.next;
			
			if(isAhead){
				head=tempAttachB;
				tempAttachNextB=tempAttachA;
				tempb.next=tempa;
				tempa.next=tempAttachNextB;
			}
			tempa.next=tempAttachB;
			tempAttachB.next=tempAttachNextA;
			
			tempb.next=tempAttachA;
			tempAttachA.next=tempAttachNextB;
		}
	}
	
	
	public static void main(String a[]){
		
		Node head= new Node(10);
		
		    head.push(head, 1);
		    head.push(head, 3);
		    head.push(head, 5);
		    head.push(head, 6);
		    head.push(head, 9);
		    head.push(head, 50);
		    head.push(head,33);
		    head.display(head);
		   // System.out.println(head.next.data);
		   head.swap(head, 5, 33);
		    System.out.println("After Changes..........");
		  head.display(head);
		
		  //   System.out.println(head.lengthFinder(head));
		    
	}
	
}
