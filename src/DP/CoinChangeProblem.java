package DP;

import java.util.Arrays;

public class CoinChangeProblem {
    public static int coinChange(int a[],int n){
    	int m=a.length;
    	int tp[][]=new int[m+1][n+1];
    	 for (int i = 0; i < tp.length; i++){
    	        Arrays.fill(tp[i], 0);
    	    }
    	
    	 tp[0][0]=1;
    	 //we will skip first row for tp from the calculation//
    	 for(int i=1;i<=m;i++){
    		 
    		 for(int j=0;j<=n;j++){
    			 
    			 //a[i-1] because the indexes start form 1 and original array has first element from 0 till m-1//
    			  if(j-a[i-1]<0){
    				 tp[i][j]=tp[i-1][j];
    			 }
    			 else{
    				 
    				 tp[i][j]=tp[i-1][j]+tp[i][j-a[i-1]];
    				
    			 }
    		 }
    	 }
    	 
    	 return tp[m][n];
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]={1,2,3,5};
    int n=7;
    
    System.out.println(coinChange(a,n));
    
	}

}
