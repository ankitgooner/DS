package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={5,6,1,2,3,10,25,71,4,11};
		int n=a.length;

		for(int i=n-1;i>1;i--){

			for(int j=0;j<i;j++){


				if(a[j+1]<a[j]){
					int temp=a[j];
					
					a[j]=a[j+1];
					
					a[j+1]=temp;

				}

			}

		}

		for(int i=0;i<n;i++){

			System.out.println(a[i]+" ");
		}
	}

}
