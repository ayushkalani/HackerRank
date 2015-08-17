import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PlaindromeIndex {
	 public static void main(String[] args) throws IOException{
	 	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	 	Scanner sc=new Scanner(System.in);
	 	int n=sc.nextInt();
	 	String[] mau=new String[n];
	 	for ( int i=0;i<n ;i++ ) {

	 		mau[i]=br.readLine();
	 	}
	 	for (int i=0;i<n ;i++ ) {
	 		if(isPlaindrome(mau[i])){
	 				System.out.println("-1");
	 		}
	 		else{
	 					String aw=mau[i];
	 					int l=aw.length();
	 					for (int j=1;j<d ;j++ ) {
						String shit=aw.substring(j,l)+aw.substring(,);

	 					}

	 		
	 	}

		
	}
	
}
public static boolean isPlaindrome(String str){
		 return str.equals(new StringBuilder(str).reverse().toString());
	}
}