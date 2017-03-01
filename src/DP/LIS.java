package DP;

public class LIS {
	
	public static void main(String a[]){
		int maxlength=1;
	int n[]={5,2,8,3,9,10,11,12,14};
	int table[]=new int[n.length];
	for(int i =0;i<n.length;i++){
		
		table[i]=1;
	}
	for(int i=0;i<n.length-1;i++){
		for(int j=i+1;j<n.length;j++){
			if(n[j]>n[i]){
				System.out.println(n[j]);
				table[i]+=1;
				i++;
			}
			
		}
		if(max(table[i],maxlength)){
			maxlength=table[i];
		}
	}
	
	System.out.println(maxlength);
	}
	public static  boolean max(int i,int j){
		
	boolean p=(i>j)?true:false;
	
	return p;
	}

}
