import java.util.ArrayList;
import java.util.Arrays;


public class LIS {
	public static void main(String[] args) {
		
		int arr[]={3,2,6,4,5,1};
		
		int tem[]=new int[arr.length];
		Arrays.fill(tem, 1);
		ArrayList list=new ArrayList();
		
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j] && tem[i]<tem[j]+1){
					tem[i]=tem[j]+1;
					System.out.print(i+" ");
				}
			}
		}
		System.out.println();
		int Max=0;
		for(int k=0;k<tem.length;k++){
//			if(Max<tem[k]){
//				Max=tem[k];
//			}
			
			System.out.println(tem[k]);
		}
		
//		System.out.println(Max);
		
	}
	
	
}
