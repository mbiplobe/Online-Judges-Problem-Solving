import java.io.FileReader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Main { 
	public static void main(String[] args) { 
		try{ 
//			Scanner Sc=new Scanner(new FileReader("E:\\android\\OnlineJudgeProject\\src\\mib.txt"));
			Scanner Sc=new Scanner(System.in);
				while(Sc.hasNext()){
					int Number=Sc.nextInt();
					int array[]=new int[Number];
					
					for(int i=0;i<Number;i++){
						int x=Sc.nextInt();
						array[i]=x;
					}
					int loc=0;
					for(int i=0;i<Number;i++){
						if(array[i]<0){
							loc++;
							break;
						}
					}
					if(loc==0) System.out.println("Jolly");
					else System.out.println("Not Jolly");
				}
		}catch(Exception e){
//			System.out.println(e.getMessage());		
		} 
	}
}