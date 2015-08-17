package hackerank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Got {

	public static void main(String[] args) throws IOException {
		// To check for palindrome//program for palindorme
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str  = br.readLine();
		int len = str.length();
		int count=0;
		
		if(len%2==0)
		{
			for(int i=0;i<=(len/2)-1;i++)
			{
				for(int j=len-1;j>=len/2;j--)
				{
					if(str.charAt(i)==str.charAt(j)){
						count++;
					}
				}
			}
			if(count==(len/2))
			{System.out.print("YES");}
			else{System.out.print("NO");}
		}
		else{
			int i=0;int j=0;count=0;
			for(i=0;i<(len/2);i++)
			{
				for(j=len-1;j>len/2;j-- )
				{
					if(str.charAt(i)==str.charAt(j)){
						count++;
					}
				}
			}
			if(count==(len/2))
			{System.out.print("YES");}
			else{System.out.print("NO");}
		}
		

	}

}
