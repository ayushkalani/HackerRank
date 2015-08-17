package hackerank;

import java.util.Scanner;

public class MansaAndStones {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		//int sum=0;
			for(int i=0;i<test;i++){
		int	n=sc.nextInt();
		int	a=sc.nextInt();
		int	b=sc.nextInt();
			
		
		for(int j=0;j<n;j++){
			int sum=((n-1-j)*a+j*b);
			System.out.println(sum);
		}
	}

	}
}
