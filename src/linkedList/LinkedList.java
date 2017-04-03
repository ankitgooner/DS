package linkedList;




public class LinkedList{
	
	
	//push the data in the list//
Node push(Node head,int data){
		
		Node newNode=new Node(data);
		if(head==null)
			head=newNode;
		else{
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=newNode;
		
		}
		return head;
	}
//to display the list//
void display(Node head){
	
	while(head!=null){
		
		System.out.println(head.data);
		head=head.next;
	}
	
	
}

Node swap(Node head,int a,int b){
	
	//both are same elements and located at heads
     if(a==b){
    	 System.out.println("A and B are same : original List will be returned");
    	 return head;
     }
	
     
	boolean founda=false,foundb=false,isAhead=false,isBhead=false;Node preva=null,prevb=null,curra=null,currb=null,nexta=null,nextb=null;;
	Node temp=head;
	
	if(head.data==a){
		isAhead=true;
		curra=head;
		founda=true;
		}
	
	if(head.data==b){
		isBhead=true;
		currb=head;
		foundb=true;
		}
	
	
	
	
	while(temp.next!=null){
		
		if(temp.next.data==a  && !founda){
			founda=true;
			 preva=temp;
			 curra=temp.next;
		}
		
		if(temp.next.data==b && !foundb){
			foundb=true;
			 prevb=temp;
			 currb=temp.next;
		}
		
		temp=temp.next;
	}
	
	//Enter only if both A and B are found//
	if(founda&&foundb){
				
		nextb=currb.next;
		nexta=curra.next;
		
		/*BEGIN
		 * Handling cases where A or B is a head node
		 */
		
		if(isAhead)
			//if A is head of the list just make B as the head
			head=currb;
		//otherwise point the previous pointer of A to B
			else
				preva.next=currb;
			
		
		 if(isBhead)
			head=curra;
			
		 else
				prevb.next=curra;
		
		 /*END
			 * Handling cases where A or B is a head node
			 */
		 
		 
		 /*BEGIN
			 * Handling cases where A or B are adjacent
			 */
		 
		 //A is just after B , point A to B .Of course checking if B is not the last node, thn no need to update next of B to A
		if(nextb!=null&&curra.data==nextb.data){
			curra.next=currb;
		}
		else{
			curra.next=nextb;
		}
		
		 
		if(nexta!=null&&currb.data==nexta.data){
			currb.next=curra;
		}
		else{
			currb.next=nexta;
		}
		
		
		/*END
		 * Handling cases where A or B are adjacent
		 */
	}
	else{
		System.out.println("Either A or B OR both A and B are not in the list: original List will be returned");
		
	}
	return head;
}


 
//	
//	int lengthFinder(Node head){
//		
//		if(head==null)
//		return 0;
//		
//		else 
//			return 1+lengthFinder(head.next);
//		
//		
//	}
//	
	
	public static void main(String a[]){
		LinkedList ll=new LinkedList();
		Node head=null;
		head=ll.push(head,10);
		head=ll.push(head, 1);
		head=ll.push(head, 3);
		head=ll.push(head, 5);
		head=ll.push(head, 6);
		head=ll.push(head, 9);
		head=ll.push(head, 50);
		head=ll.push(head,33);
		    
		    System.out.println("Printing Original list");
		    ll.display(head);
	
		     head= ll.swap(head, 10, 33);
		 
		     System.out.println("Printing Swapped list");
		     ll.display(head);
		
		 
		    
	}
	
}
	
