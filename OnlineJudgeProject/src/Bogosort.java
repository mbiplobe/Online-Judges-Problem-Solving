import java.util.Scanner;


public class Bogosort {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int N=Sc.nextInt();
		int array[]=new int[N];
			for(int i=0;i<array.length;i++){
				array[i]=Sc.nextInt();
			}
		BogoSort(array);
			for(int i=0;i<array.length;i++){
				System.out.println(array[i]);
			}
	}
	private static void BogoSort(int array[]){
		while(!IssortedList(array)){ Shaf(array);}
	}
	private static boolean IssortedList(int array[]){
		int L=array.length-1;
		while(--L>=1){
			if(array[L]<array[L-1]) return false;
//			L--;
		}
		
		return true;
	}
	private static void Shaf(int array[]){
		int L=array.length-1;
		
		for(int i=0;i<=L;i++){
			int T=array[i];
			int r=(int)(Math.random()%L);
			array[i]=array[r];
			array[r]=T;
		}
		
	}

}
