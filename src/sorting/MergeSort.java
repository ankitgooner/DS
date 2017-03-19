package sorting;

import java.util.Arrays;

public class MergeSort {
   static int arraytoUse[]={23,47,81,95,7,14,39,55,62,74};
   //static int arraytoUse[]={3,2,1,4};
	public static void main(String k[]){
		int n=arraytoUse.length;
		int tempArray[]=new int[n];
		//MergeSort m=new MergeSort();
		//m.msort(tempArray,0,n-1);
		
		int arrayA[]={23,47,81,95};
		int arrayB[]={7,14,39,55,62,74};
		
		int arrayC[]= new int[10];
		
		mergeSort(arrayC,0,9);
		//merge(arrayA,4,arrayB,6,arrayC);
		 System.out.println(Arrays.toString(arrayC));		
		
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
			int mid=(low+high)/2;
			
			mergeSort(a,low,mid);
			
			mergeSort(a,mid+1,high);
		
			merge(a,low,mid,high);
		}
		
	}
/*public void merge(int []tempArray,int low,int mid,int high)	{
	
	
	int j=0;
	
	int i=low;
	int k=mid;
	
	   while(i<=mid && k<=high){
		   
		   if(arraytoUse[i]<arraytoUse[k]){
			   tempArray[j++]=arraytoUse[i++];
		   }
		   
		   else{
			   tempArray[j++]=arraytoUse[k++];
			   
		   }
		   
		   
	   }
	   while(i<mid){
		   tempArray[j++]=arraytoUse[i++];
	   }
	   while(k<high){
		   System.out.println("value"+k);
		   tempArray[j++]=arraytoUse[k++];
	   }
	
}*/
   public static void merge(int[] a1,int low,int mid,int high){
		int i=low;int j=mid;int k=0;
		 
		while(i<=mid && j<=high){
			
			if(arraytoUse[i]<arraytoUse[j])
				{
				a1[k++]=arraytoUse[i];
				i++;
				}
			else{
				a1[k++]=arraytoUse[j];
				j++;
			}}
			while(i<mid)
				a1[k++]=arraytoUse[i++]; 
			while(j<high)
				a1[k++]=arraytoUse[j++];
		
	}
}
