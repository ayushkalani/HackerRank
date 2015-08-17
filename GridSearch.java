import java.io.*;
import java.util.*;
//very inefficent and time complex program WARNING : THIS A VERY ERR PIECE OF CODE :()
public class GridSearch  {

		 public static void main(String[] args) throws IOException{
		 
		 		 	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 		 	Scanner sc=new Scanner(System.in);
		 		 	//bigger grid
		 		 	int r=sc.nextInt();
		 		 	int n=sc.nextInt();
		 		 	String[] bgrid=new String[r];
		 		 	for (int i=0;i<r ;i++ ) {
		 		 		bgrid[i]=br.readLine();
		 		 		
		 		 	}
		 		 	//smaller grid
		 		 	int rt=sc.nextInt();
		 		 	int ct=sc.nextInt();
		 		 	String[] sgrid=new String[rt];
		 		 	for (int i=0;i<rt ;i++ ) {
		 		 		sgrid[i]=br.readLine();
		 		 		
		 		 	}
		 		 	//grid search
		 		 	for (int i=0;i<rt ;i++ ) {
		 		 		int key=Integer.parseInt(sgrid[i]);
		 		 		int pivot =0;
		 		 		//int l=0;
		 		 		
		 		 	}

		  }
}