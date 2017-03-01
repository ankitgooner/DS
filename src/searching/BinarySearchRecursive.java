package searching;

public class BinarySearchRecursive {

	
	
	public static void main(String p[]){
		
		int a[]={1,5,6,8,9,12,15,18};
		int low=0;
		int high=a.length-1;
		System.out.println(bs(a,12,low,high));
	}
	
	public static int bs(int a[],int key,int low,int high){
		
		
		
if(low<=high){	
	int mid=(low+high)/2;
	if(a[mid]==key){
		System.out.println("found");
		return mid;
	}
	
	if(key<a[mid]){
		System.out.println("here 1");
		 return bs(a,key,low,mid-1);}
	
		System.out.println("here 2");
		return  bs(a,key,mid+1,high);}
	

	return -1;
}
	
	
}