package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={5,6,1,2,3};
		int n=a.length;
		int temp;
		for(int i=1;i<n;i++){
			 int j=i;
			 temp=a[i];
			while(j>0&& a[j-1]>temp){

				a[j]=a[j-1];
				j--;
		}
           a[j]=temp;
		}
		for(int i=0;i<n;i++){

			System.out.println(a[i]+" ");
		}
	}

}
