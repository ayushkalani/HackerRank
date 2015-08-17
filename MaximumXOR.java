package hackerank;

import java.util.Scanner;

public class MaximumXOR {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int max=0;
		for(int i=l;i<=r;i++)
		{
			for(int j=l;j<r;j++)
			{
				int c = i^j;
				
				if(c>max)
				{
					max=c;
				}
			}
		}
		System.out.println(max);
		
	}

}
