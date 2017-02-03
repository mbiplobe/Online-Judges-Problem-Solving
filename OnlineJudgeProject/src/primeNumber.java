import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class primeNumber{
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int N=Sc.nextInt();
		
		IsPrime(N);
//		else System.out.println("Not Prime");
	}
	private static void IsPrime(int N){
		boolean[] prime=new boolean[N+1];
		Arrays.fill(prime,true);
		prime[0]=false;
		prime[1]=false;
		int m=(int) Math.sqrt(N);
			for(int i=2;i<=m;i++)
				if(prime[i])
					for(int j=i*i;j<=N;j+=i)
						prime[j]=false;
						
					ArrayList list=new ArrayList();
				for(int k=0;k<prime.length;k++)
			if(prime[k]) list.add(k);
		for(int l=0;l<list.size();l++)
	System.out.println(list.get(l));
	}
}