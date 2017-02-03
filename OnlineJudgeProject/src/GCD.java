import java.util.Scanner;


public class GCD {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		
		int N=Sc.nextInt();
		for(int i=1;i<=N;i++){
			int A=Sc.nextInt();
			int B=Sc.nextInt();
			int reminder=0;
			while(A%B!=0){
				reminder=(A%B);
				A=B;
				B=reminder;
			}
			System.out.println(reminder);
		}
	}
}
