import java.io.*;
import java.util.*;
import java.math.*;
public class FibMod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BigInteger a=BigInteger.valueOf(sc.nextInt());
		BigInteger b=BigInteger.valueOf(sc.nextInt());
		BigInteger n=BigInteger.valueOf(sc.nextInt());
		rec(a,b,n);
	}
	public static void rec(BigInteger a,BigInteger b,BigInteger n){
		BigInteger tn=a;
		// int ask=10;
		// BigInteger ask=new BigInteger.valueOf(ask.intValue());
		BigInteger tn1=b;
		tn1=tn1.multiply(tn1);
		BigInteger ans=tn1;
		ans=ans.add(tn);
		BigInteger check=BigInteger.valueOf(4);
		int res= n.compareTo(check);
		if(res==-1)
		{
			System.out.println(ans);
		}
		else
		{
			BigInteger lund=BigInteger.valueOf(1);
			n=n.subtract(lund);
			rec(tn1,ans,n);
		}
			
	}
}
