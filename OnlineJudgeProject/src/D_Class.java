import java.util.Arrays;

public class D_Class{
	public static void main(String[] args) {
		
		try{
		int a[]={ 1, 5, 4, 2, 3, 7, 6};
		int list[][]=new int[a.length][a.length];
		list[0][0]=1;
		for(int i=1;i<a.length;i++){
			int k=0;
			for(int j=0;j<i;j++){	
				
				
				if(a[i]>list[i-1][j]){
					list[i][k++]=list[i-1][j];
				}
			}
			list[i][k++]=a[i];
			
		}
		
		
		for(int i=0;i<list.length;i++){
			for(int j=0;j<list.length;j++){
				
				if(list[i][j]!=0)
						System.out.print(list[i][j]+" ");
			}
			System.out.println();
		}
		
//		System.out.println("Length="+Cal_InSec(list));
		Cal_InSec(list);
	}catch(Exception E){
		
	}
	}
	
	private static void Cal_InSec(int list[][]){
		
		int c,max=0;
		int Loc=0;
		for(int i=0;i<list.length;i++){
			c=0;
			for(int j=0;j<list.length;j++){
				if(list[i][j]!=0){
					++c;
				}
			}
			int T=c;
			if(max<T){
				max=T;Loc=i;
			}
		}
		System.out.println("Length of LIS"+ max);
		
		System.out.println("LIS is");
		for(int i=0;i<list.length;i++){
			if(list[Loc][i]!=0){
				System.out.print(list[Loc][i]+" ");
			}
		}
		
	}
}