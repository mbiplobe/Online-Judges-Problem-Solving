import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Sc=new Scanner(System.in);
		int Test=Sc.nextInt();
		for(int t=1;t<=Test;t++){
			long a=Sc.nextLong();
			long b=Sc.nextLong();
			
			if(a<b){
				System.out.println("<");
			}
			else if(a>b){
				System.out.println(">");
			}
			else {
				System.out.println("=");
			}
		}
		

	}

}
