import java.util.Scanner;


public class NewMain {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		
		while(Sc.hasNext()){
			int B[]=new int[3];
			int G[]=new int[3];
			int C[]=new int[3];
			
			for(int i=0;i<B.length;i++){
				B[i]=Sc.nextInt();
				G[i]=Sc.nextInt();
				C[i]=Sc.nextInt();
			}
			
			String k;
					
					
					int Min=0,Tmp;
					Tmp=B[1]+B[2]+G[0]+G[1]+C[0]+C[1];
					
					if(Tmp<Min){
						Min=Tmp;
						k="BCG";
					}
//					else if()
					
					
					
		}

	}

}
