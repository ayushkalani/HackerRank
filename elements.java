import java.io.*;
import java.util.*;

class elements
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		String[] arr=new String[test];
		for (int i=0;i<test ;i++ )
		{
			arr[i]=br.readLine();
		}
		
		ArrayList<HashSet<Character>> take = new ArrayList<HashSet<Character>>();
		
		for(int i=0;i<arr.length;i++)
		{
			HashSet<Character> t = new HashSet<Character>();
			for(char c:arr[i].toCharArray())
			{
				t.add(c);
			}
			take.add(t);
		}
		
		HashSet<Character> out = new HashSet<Character>(take.get(0)); // use the copy constructor
		out.retainAll(take.get(1));

		for(int i=2;i<take.size();i++)
		{
			out.retainAll(take.get(i));
		}

		System.out.println(out.size());

	}
}
