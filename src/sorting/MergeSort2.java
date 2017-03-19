package sorting;

import java.util.Arrays;

public class MergeSort2 {
	static int arrToBeSorted[]={3,2,1,4};
	public static void main(String[] args) {
		
		int arrayA[]={23,47,81,95};
		int arrayB[]={7,14,39,55,62,74};
		
		int arrayC[]= new int[10];
		
		mergeSort(arrayC,0,9);
		//merge(arrayA,4,arrayB,6,arrayC);
		 System.out.println(Arrays.toString(arrayC));		
				
		// TODO Auto-generated method stub

	}
	
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
public static void merge(int[] a1,int low,int mid,int high){
	int i=low;int j=mid;int k=0;
	 
	while(i<=mid && j<=high){
		
		if(arrToBeSorted[i]<arrToBeSorted[j])
			{
			a1[k++]=arrToBeSorted[i];
			i++;
			}
		else{
			a1[k++]=arrToBeSorted[j];
			j++;
		}}
		while(i<mid)
			a1[k++]=arrToBeSorted[i++]; 
		while(j<high)
			a1[k++]=arrToBeSorted[j++];
	
}
}
