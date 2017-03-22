package DP;

public class LCS {

	public int max(int i,int j){
		
		return i>j?i:j;
		
	}
	
	public  int calcLCS(char a[],char b[]){
		
		int n=a.length;int m=b.length;
		
		int lcs[][]=new int[n+1][m+1];
		
		for(int i=0;i<=n;i++){
			for(int j=0;j<=m;j++){
				
				if(i==0 || j==0){
					
					lcs[i][j]=0;
				}
				else if(a[i-1]==b[j-1]){
					lcs[i][j]=lcs[i-1][j-1]+1;
				}
				else{
					lcs[i][j]=max(lcs[i-1][j],lcs[i][j-1]);
					
				}
			}
		}
		return lcs[n][m];
	}
	public static void main(String p[]){
		char a[]={'A','B','C','D','E','F','G','H'};
		char b[]={'X','B','E','G','H'};	
		
		System.out.println(new LCS().calcLCS(a, b));
		}
		
		
	}

