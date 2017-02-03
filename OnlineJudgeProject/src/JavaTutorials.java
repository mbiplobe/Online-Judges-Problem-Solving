import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class JavaTutorials {
	public static void main(String[] args) {
		try{
			
//			String  tmt="E:\\android\\OnlineJudgeProject\\src\\mib.txt";
//			FileReader file=new FileReader(tmt);
//			Scanner Sc=new Scanner(file);
			Scanner Sc=new Scanner(System.in);
//			int Test=Sc.nextInt();
//			for(int i=1;i<=Test;i++){
//				int A=Sc.nextInt();
//				int B=Sc.nextInt();
				
			
			int M=Sc.nextInt();
			int N=Sc.nextInt();
			int a=Sc.nextInt();
			
			int ans=(int) Math.ceil((double)(M)/a)*(int)(Math.ceil((double)(N)/a));
			
				
				System.out.println(ans);
//			}
		}catch(Exception e){
			
		}
	}
}
