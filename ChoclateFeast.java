package hackerank;

import java.util.Scanner;

public class ChoclateFeast {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=0;i<test;i++)
		{
			int n =sc.nextInt();
			int c =sc.nextInt();
			int m =sc.nextInt();
			int eat=n/c;
			int bc=eat;
			if(m>eat)
			{
				System.out.println(eat);
				
			}
			else if(eat==m)
			{
				System.out.println(eat+1);
			}
			else{
				int flag=0;int lund=eat-m;
				
				while(lund>=0){
				lund=eat-m;
				eat=lund+1;
				flag++;
				
				
				}
				System.out.println(flag+bc-1);
			}
		}
	}

}
