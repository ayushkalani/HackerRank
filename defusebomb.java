import java.io.*;
import java.util.*;
class defusebomb{

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		String[] take=new String[test];
		for(int i=0;i<test;i++){
			take[i]=br.readLine().replaceAll("\\s+","");

		}
		
		for (int i=0;i<test ;i++ ) {
			int a=(int)(take[i].charAt(0));
			int b=(int)(take[i].charAt(1));
			int c=(int)(take[i].charAt(2));
			if(c>a && c>b){
				System.out.println("NO");
				System.exit(0);
			}
			
			int pelu=findgcd(a,b);

			if(c%pelu==0 ){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}

		}
	}
	public static int findgcd(int a, int b) {
    if (b == 0) return a;
    else return (findgcd (b, a % b));
	}
}