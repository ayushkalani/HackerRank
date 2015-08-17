package hackerank;
import java.util.*;
public class CutTheSticks {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		ArrayList<Integer> chill = new ArrayList<Integer>();
		for(int i=0;i<test;i++)
		{
			chill.add(sc.nextInt());
		}
		 Collections.sort(chill);
		 int pivot=chill.get(0);
		
			for(int j=0;j<test;j++)
			{
				int flag=0;
				for(int r=0;r<test;r++)
				{ 
					
					if(chill.get(r)>0)
					{
					flag++;
					}	
					chill.set(r, (chill.get(r)-pivot));
				}
				if(flag==0)
				{
					System.exit(0);
				}
				System.out.println(flag);
			}
		}
	}	 