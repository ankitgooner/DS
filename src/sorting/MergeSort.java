package sorting;

import java.util.Arrays;

public class MergeSort {
   static int arraytoUse[]={23,47,81,95,7,14,39,55,62,74};
   //static int arraytoUse[]={3,2,1,4};
	public static void main(String k[]){
		int n=arraytoUse.length;
		
		
		
		int arrayC[]= new int[n];
		
		mergeSort(arrayC,0,n-1);
		
		 System.out.println(Arrays.toString(arraytoUse));		
		
	}
/*   public static void msort(int []tempArray,int low,int high){
		
	
	
	if(low==high)
		
		return;
	
		
	else{
		int mid=(low+high)/2;
		msort(tempArray,low,mid);
		
		msort(tempArray,mid+1,high);
		
		merge(tempArray,low,mid,high);
		
		
	}
	
	}*/
public static void mergeSort(int a[],int low,int high){
		
		if(low==high){
			
			return;
		}
		else{
			int mid=low+((high-low)/2);
			
			mergeSort(a,low,mid);
			
			mergeSort(a,mid+1,high);
		
			merge(a,low,mid,high);
		}
		
	}
public static void merge(int []tempArray,int low,int mid,int high)	{
	
	
	int j=0;
	
	int i=low;
	int k=mid+1;
	
	   while(i<=mid && k<=high){
		   
		   if(arraytoUse[i]<arraytoUse[k]){
			   tempArray[j++]=arraytoUse[i++];
		   }
		   
		   else{
			   tempArray[j++]=arraytoUse[k++];
			   
		   }
		   
		   
	   }
	   while(i<=mid){
		   tempArray[j++]=arraytoUse[i++];
		  
	   }
	   while(k<=high){
		   System.out.println("value"+k);
		   tempArray[j++]=arraytoUse[k++];
		   //j++;
		  // k++;
	   }
	   int s=0;
	   for(int p=low;p<=high;p++){
		   arraytoUse[p]=tempArray[s++];
		   
	   }
	
}
  
}
