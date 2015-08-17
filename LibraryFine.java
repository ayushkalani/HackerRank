import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LibFine {

	{
	Scanner sc = new Scanner(System.in);
	String s=sc.nextLine();
	s=s+" 5555";
	String st[]=s.split(" ");
	int i=0;
	int len = st.length;
	int a[]=new int[len];
	for(String z : st)
	{
		a[i]=Integer.parseInt(z);
		i++;
	}
	Arrays.sort(a);

	i=0;
	int k;
	int ini=a[0];
	int last=ini;
	while(i<len-1)
	{
		if(Math.abs(a[i] - a[i+1]) == 1)
		{	
			i=i+1;
		}
		else
		{
			last = a[i];

			if(ini == last)
				System.out.print(ini+" ");
			else
				System.out.print(ini+"-"+last+" ");
			i=i+1;
			ini = a[i];
		}
	}
}
}