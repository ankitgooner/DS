package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={5,6,1,2,3};
		int n=a.length;
		int min;
		for(int i=0;i<n-1;i++){
			min=i;
			for(int j=i+1;j<n;j++){


				if(a[j]<a[min]){
					min=j;

				}

			}
			if(min!=i){
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}

		for(int i=0;i<n;i++){

			System.out.println(a[i]+" ");
		}
	}

}
