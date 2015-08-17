import java.io.*;
import java.util.*;

public class SongsOfPi  {

		 public static void main(String[] args) throws IOException{
		 
		 		 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 		 	Scanner sc=new Scanner(System.in);
		 		 	int n=sc.nextInt();
		 		 	//constants declarations
		 		 	String check="31415926535897932384626433833";
		 		 	String bc="";
		 		 	//input accroding to hackernak
		 		 	String[] mau=new String[n];
		 		 	for(int i=0;i<n;i++){
		 		 		mau[i]=br.readLine();

		 		 	}
		 		 		
		 		 	for (int i =0;i<n ;i++ ) {
		 		 		String str=mau[i];
		 		 		ArrayList<String> s=new ArrayList<String>(Arrays.asList(str.split(" ")));
		 		 		for (int j=0;j<s.size();j++ ) {
		 		 			int [] len=new int[s.size()];
		 		 			String l=s.get(j);
		 		 			bc=bc.concat(Integer.toString(l.length()));
		 		 			

		 		 		}
		 		
		 		 		String ans=check.substring(0,(bc.length()));
		 		 		
		 		 		if(bc.equals(ans)){
		 		 			System.out.println("It's a pi song.");
		 		 		}
		 		 		else{
		 		 			System.out.println("It's not a pi song.");
		 		 		}
		 		 	}
		 		 	
			
		}

		
}
