import java.util.Arrays;
import java.util.Scanner;


public class longestIncreaseC {
	public static void main(String[] args) {
		int a[]={3,2,6,4,5,1};
		int M[]=getLIS(a);
		System.out.println(Arrays.toString(M));
	}
	
	private static int[] getLIS(int []lis){
		int n=lis.length;
		
		int[]len=new int[n];
		int[]pred=new int[n];
		
		Arrays.fill(len, 1);
		Arrays.fill(pred, -1);
		
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(lis[i]>lis[j]&&(len[i]<len[j]+1)){
					len[i]=len[j]+1;
					pred[i]=j;
				}
			}
		}
		int hi=0;
		for(int i=1;i<n;i++){
			if(len[hi]<len[i]){
				hi=i;
			}
		}
		int ctn=len[hi];
		int res[]=new int[ctn];
		
		for(int i=hi;i!=-1;i=pred[i]){
			res[--ctn]=lis[i];
		}
		return res;
	}
}