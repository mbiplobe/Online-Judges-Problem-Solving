import java.util.Scanner;

public class BinarySearch{
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		
		int N=Sc.nextInt();
		int array[]=new int[N];
		
		for(int i=0;i<array.length;i++){
			int x=Sc.nextInt();
			array[i]=x;
		}
		Quicksort(array,0,array.length-1);
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
	}
	private static void Quicksort(int array[],int low,int high){
		int index=partitions(array,low,high);
		if(low<index-1){
			Quicksort(array,low,index-1);
		}
		else if(high>index){
			Quicksort(array,index,high);
		}
		
	}
	private static int partitions(int array[],int Left,int Right){
		int pivot=array[Left];
		while(Left<=Right){
			while(array[Left]<pivot) Left++;
			while(array[Right]>pivot) Right--;
			if(Left<=Right){
				int T=array[Left];
				array[Left]=array[Right];
				array[Right]=T;
				
				Left++;
				Right--;
			}
		}
		return Left;
	}
}