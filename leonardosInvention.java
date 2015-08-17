import java.io.*;
import java.util.*;
import java.math.*;

class leonardos{
	public static void main(String[] args) throws IOException{
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 Scanner sc = new Scanner(System.in);
		 int n=Integer.parseInt(br.readLine());
         int ans=0;
         String a=br.readLine().replaceAll("\\s+","");
         int b=0;
        
            for (int i=0;i<n-1;i++ ) {
                int x=0;int y=0;int count=0;
                for (int j=i+1;j<n ;j++ ) {
                    if(a.charAt(i)==a.charAt(j)&&i!=j) {
                         x=a.indexOf(a.charAt(i));
                         y=a.indexOf(a.charAt(j));
                          for (int p=x+1;p<=y ;p++ ) {
                                if(a.charAt(p)<=a.charAt(i)){
                                         count++;
                                         }
                                 }
                                 if(count==Math.abs(y-x)){
                                     ans++;
                              }
                        }   
                }             
            }
            System.out.println((ans)*2);
     }
}
