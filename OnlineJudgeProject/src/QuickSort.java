import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class QuickSort {
	public static void main(String[] args) {
//		ArrayList list=new ArrayList();
		try{
		Scanner Sc=new Scanner(System.in);
	int size=Sc.nextInt();
	for(int l=1;l<=size;l++){
		int array[]=new int[3];
		for(int i=0;i<array.length;i++){
			int X=Sc.nextInt();
//			list.add(X);
			array[i]=X;
			
		}
//		list.sort(null);
		Quicksort(array,0,array.length-1);
//		
////  Binary search
//		System.out.println("Enter element would you search");
//		int want=Sc.nextInt();
//		
//		BinarySearch(array,want);
		
//		for(int i=0;i<array.length;i++){
//			System.out.print(array[i]+" ");
//		}
//		System.out.println();
		
		System.out.printf("Case %d: %d\n",l,array[1]);
		}
		}catch(Exception e){
			
		}
	}
	public static void Quicksort(int []array,int Start,int End){
		int index=partition(array,Start,End);
		
		if(Start<index-1){
			Quicksort(array,Start,index-1);
		}
		if(index<End){
			Quicksort(array,index,End);
		}
	}
	public static int partition(int []array,int Left,int Right){
		int pivot=array[Left];
		while(Left<=Right){
			while(array[Left]<pivot){
				Left++;
			}
			while(array[Right]>pivot){
				Right--;
			}
			if(Left<=Right){
				int P=array[Left];
				array[Left]=array[Right];
				array[Right]=P;
				
				Left++;
				Right--;
			}
		}
		
		return Left;
}
//	
//	private static void BinarySearch(int array[],int want){
//		int Start=1,End=array.length,Mid=(Start+End)/2;
//			while(Start<=End && array[Mid]!=want){
//				if(want<array[Mid]){
//					End=Mid-1;
//				}
//				else if(want>array[Mid]){
//					Start=Mid+1;
//				}
//				Mid=(Start+End)/2;
//			};
//			if(want==array[Mid]) System.out.println("Locations is :"+(Mid+1));
//			else System.out.println("Iteam does not exist in the List");
//		
//	}
}
