import java.util.Scanner;


public class Main {
   public static void main(String[] args) {
	
	   Scanner Sc=new Scanner(System.in);
	   while(Sc.hasNext()){
		   long Number=Sc.nextLong();
		   int Croti=0,Lack=0,thousand=0,handread=0,akok=0,Kuti_kuti=0,Kuti_Lack=0,Kuti_thousand=0,Kuti_shata=0,kuti_akok=0;
		   if(Number>=10000000){
			  
			   Croti=(int)(Number/10000000);
			   //croti start
			   if(Croti>=10000000){
					  
				   Kuti_kuti=(int)(Croti/10000000);

				   Croti%=10000000;
				   
				   Kuti_Lack=(int)Croti/100000;
				   Croti%=100000;
				   
				   Kuti_thousand=(int)Croti/1000;
				   Croti%=1000;
				   
				   Kuti_shata=(int)(Croti/100);
				   Croti%=100;
				   kuti_akok=(int)Croti;
				   
			   }
			   else if(Croti>=100000 && Croti<10000000){
				   Kuti_Lack=(int)Croti/100000;
				   Croti%=100000;
				   
				   Kuti_thousand=(int)Croti/1000;
				   Croti%=1000;
				   
				   Kuti_shata=(int)(Croti/100);
				   Croti%=100;
				   kuti_akok=(int)Croti;
				
			   }
			   else if(Croti>=1000 && Croti<100000){
				   Kuti_thousand=(int)Croti/1000;
				   Croti%=1000;
				   
				   Kuti_shata=(int)(Croti/100);
				   Croti%=100;
				   kuti_akok=(int)Croti;
				
			   }
			   else if(Croti>=100 && Croti<1000){
				   Kuti_shata=(int)(Croti/100);
				   Croti%=100;
				   kuti_akok=(int)Croti;
			   }
			   else{
				   kuti_akok=(int)Croti;
			   }

//			   croti end
			   Number%=10000000;
			   
			   Lack=(int)Number/100000;
			   Number%=100000;
			   
			   thousand=(int)Number/1000;
			   Number%=1000;
			   
			   handread=(int)(Number/100);
			   Number%=100;
			   akok=(int)Number;
			   
		   }
		   else if(Number>=100000 && Number<10000000){
			   Lack=(int)Number/100000;
			   Number%=100000;
			   
			   thousand=(int)Number/1000;
			   Number%=1000;
			   
			   handread=(int)(Number/100);
			   Number%=100;
			   akok=(int)Number;
			
		   }
		   else if(Number>=1000 && Number<100000){
			   thousand=(int)Number/1000;
			   Number%=1000;
			   
			   handread=(int)(Number/100);
			   Number%=100;
			   akok=(int)Number;
			
		   }
		   else if(Number>=100 && Number<1000){
			   handread=(int)(Number/100);
			   Number%=100;
			   akok=(int)Number;
		   }
		   else{
			   akok=(int)Number;
		   }
//	   
//	   if(Croti>0||Lack>0||thousand>0||handread>0||akok>0){
//		   System.out.println(Croti);
//	   }
		   String Name="";
//		   croti
		   if(Kuti_kuti>0){
			   Name+=Integer.toString(Kuti_kuti)+" kuti ";
		   }
		   if(Kuti_Lack>0){
			   Name+=Integer.toString(Kuti_Lack)+" lakh ";
		   }
		   
		   if(Kuti_thousand>0){
			   Name+=Integer.toString(Kuti_thousand)+" hajar ";
		   }
		   
		   if(Kuti_shata>0){
			   Name+=Integer.toString(Kuti_shata)+" shata ";
		   }
		   
		   if(kuti_akok>0){
			   Name+=Integer.toString(kuti_akok)+" Kuti ";
		   }
		   
//		   coti end
		   if(Lack>0){
			   Name+=Integer.toString(Lack)+" lakh ";
		   }
		   
		   if(thousand>0){
			   Name+=Integer.toString(thousand)+" hajar ";
		   }
		   
		   if(handread>0){
			   Name+=Integer.toString(handread)+" shata ";
		   }
		   
		   if(akok>0){
			   Name+=Integer.toString(akok);
		   }
		   
		   System.out.println(Name);
	   }
}
}
