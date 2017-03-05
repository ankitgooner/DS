package DP;

public class LIS {

	public static void main(String a[]){
		int maxlength=1;
		int n[]={50,8,9,5,7,6,7,8,10,11};
		int len=n.length;
		int table[]=new int[len];
		
		for(int i =0;i<len;i++){
			table[i]=1;
		}
		
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				if(n[j]>n[i] && n[j]>n[j-1]){
 				 table[i]+=1;
				}
			}
			if(max(table[i],maxlength)){
				maxlength=table[i];
			}
		}

		System.out.println("Max Length"+maxlength);
	}
	
	public static  boolean max(int i,int j){

		boolean p=(i>j)?true:false;

		return p;
	}

}
