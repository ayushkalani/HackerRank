
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] mau=new String[n];
		for(int i=0;i<n;i++){mau[i]=br.readLine();}
			
		for(int i=0;i<n;i++){
			String str=mau[i];
			int flag=0;
			ArrayList<String> s=new ArrayList<String>(Arrays.asList(str.split(" ")));
			int a=Integer.parseInt(s.get(0));
			int b=Integer.parseInt(s.get(1));
			for(int j=a;j<=b;j++){
				if(checkSquare(j)){
					flag++;
				}
			}
			System.out.println(flag);
		}
	}
	public static boolean checkSquare(int a){
		int r=(int) Math.sqrt(a);
		return r*r==a;
	}
}