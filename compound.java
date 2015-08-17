import java.io.*;
import java.util.*;

public class compound{
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=sc.nextInt();
		int le=2*n;
		String[] lol=new String[le];
		for (int i=0;i<le ;i++ ) {
			lol[i]=br.readLine();
			
		}
		for (int j=0;j<le-1 ;j=j+2 ) {
			String a=lol[j];
			String b=lol[j+1];
			if(hasSub(a,b)){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			

		}

	}
	public static boolean hasSub(String s ,String t){
		String common=s.replaceAll("[^"+t+"]","");
			if(common.length()>0)
				return true;
			return false;
	}

}
