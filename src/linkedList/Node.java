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
	
	Node swap(Node head,int a,int b){
		boolean founda=false,foundb=false,isAhead=false,isBhead=false;Node preva=null,prevb=null,curra=null,currb=null,nexta=null,nextb=null;;
		Node temp=head;
		if(head.data==a){isAhead=true;curra=head;founda=true;}
		if(head.data==b){isBhead=true;currb=head;foundb=true;}
		//System.out.println(head.next.data);
		while(temp.next!=null){
			
			if(temp.next.data==a){
				founda=true;
				 preva=temp;
				 curra=temp.next;
			}
			
			if(temp.next.data==b){
				foundb=true;
				 prevb=temp;
				 currb=temp.next;
			}
			
			temp=temp.next;
		}
		if(founda&&foundb){
			//System.out.println(tempa.data+ " "+tempb.data);
			
			
			
			nextb=currb.next;
			nexta=curra.next;
			
			if(isAhead){
				head=currb;
				//System.out.println("here");
				
			}
			else if(isBhead){
				head=curra;
				
			}
			
			if(!isAhead)
			preva.next=currb;
			if(!isBhead)
			prevb.next=curra;
			if(curra.data==nextb.data){
				curra.next=currb;
			}
			else{
				curra.next=nextb;
			}
			if(currb.data==nexta.data){
				currb.next=curra;
			}
			else{
				currb.next=nexta;
			}
			
			
			
		}
		
		return head;
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
		 head=  head.swap(head, 9, 6);
		    System.out.println("After Changes..........");
		  head.display(head);
		
		  //   System.out.println(head.lengthFinder(head));
		    
	}
	
}
