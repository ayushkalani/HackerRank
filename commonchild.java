import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class commonchild {
    public static void permutation(String str) { 
    permutation("", str); 
}
   private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) System.out.println(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
}
	 public static void main(String[] args) throws IOException{
	 	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	  
       String s1=br.readLine();
       String s2=br.readLine();
       int n=s1.length();
       int flag=0;
       permutation("kalani");


       // for (int i=0;i<s1.length();i++ ) {
       //      for (int j=0;j<s1.length() ;j++ ) {
       //             if (s1.charAt(i)==s2.charAt(j)) {
                     

       //                  flag++;
       //                  break;
                        
       //          }

       //      }
           
       // }
       // System.out.println(flag);
       //  }
    }
}