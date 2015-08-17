package hackerank;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		
		for(int j=0;j<test;j++){
			int count=0;
			
		if(1<=test&&test<=10)
		{
			
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		if(1<=n&&n<=1000&&1<=k&&k<=n){
		for(int i=0;i<n;i++)
		{
			int lund=sc.nextInt();
			if(lund<=0)
			{
				count++;
			}
			
		}
		if(count<k)
		{	
			System.out.println("YES");
			
		}
		else{
			System.out.println("NO");
		
		}
		
		}
		}
	}

	}
}
