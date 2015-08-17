package hackerank;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceLane {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lane=sc.nextInt();
		int test=sc.nextInt();
		int arr[][]=new int[test][2];
		ArrayList<Integer> width = new ArrayList<Integer>();
		for(int i=0;i<lane;i++)
		{
			width.add(sc.nextInt());
		}
		for(int i=0;i<test;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int min=0;
		for(int l=0;l<test;l++)
		{
				 min=width.get(arr[l][0]);
					for (int yu=arr[l][0];yu<(arr[l][1]+1);yu++)		
					{	
						if(width.get(yu)<min)
						{
							   min=width.get(yu);
						}
					}				
					if(min==1)
					{
						System.out.println("1");
					}
					else if(min==2)
					{
						System.out.println("2");
					}
					else{
						System.out.println("3");
					}
			 
		}
	}
	}