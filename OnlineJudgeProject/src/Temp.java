import java.util.Scanner;

public class Temp{
	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		try{
int size=Sc.nextInt();
		
		int array[]=new int[size];
		
		for(int i=0;i<array.length;i++){
			array[i]=Sc.nextInt();
		}
		
//		Quicksort(array,0,(array.length-1));
		
		for(Object ob:array){
			System.out.println(ob);
		}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
	}
//	private static void Quicksort(int A[],int L,int H){
//		int index=PivotCheck(A,L,H);
//			if(L<index-1){
//				PivotCheck(A,L,index-1);
//			}
//			if(index<H){
//				PivotCheck(A,index,H);
//			}
//	int PivotCheck(int A1[],int i,int j){
//		int pivot=A1[i];
//		while(i<=j){
//			while(A1[i]<pivot) i++;
//			while(A1[j]>pivot) j--;
//			if(i<=j){
//				int M=A1[i];
//				A1[i]=A1[j];
//				A1[j]=M;
//				i++;
//				j--;
//			}
//		};
//		return i;
//	}
//	
//			
//	}
}