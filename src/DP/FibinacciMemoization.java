package DP;

public class FibinacciMemoization {
	
	int lookup[]=new int[100];
	
	void init(int a[]){
		for(int i =0;i<lookup.length;i++){
			lookup[i]=-1;
		}
		
	}
int fib(int n){
		if(lookup[n]==-1){
			
			if(n<=1){
				lookup[n]=n;
			}
			
			else{
				
				lookup[n]=fib(n-1)+fib(n-2);
			}
		}
		return lookup[n];
	}
	public static void main(String[] args) {
		
		 FibinacciMemoization fm=new  FibinacciMemoization();
		// TODO Auto-generated method stub
          fm.init(fm.lookup);
          
          System.out.println(fm.fib(6));

	}
	

}
