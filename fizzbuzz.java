import java.io.*;
import java.util.*;

public class fizzbuzz{
	static void rev(int a){
		int l=(int)(Math.log10(a)+1);
		int b=0;
    	for (int i=0;i<l;i++ ) {
    		b=a%10;
    		a/=10;
    		System.out.print(b);
	}
}
	
    public static void main(String[] args)throws IOException{
    	//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
  		if(a>0)
  				rev(a);
    else{System.out.print("-");
    	rev(Math.abs(a));
    }
//code for fizzbuzz
    	// for (int i=1;i<100 ;i++ ) {
    	// 	if(i%3==0 && i%5==0){
    	// 		System.out.println("FIZZBUZZ");
    	// 	}
    	// 	else if( i%5==0){
    	// 		System.out.println("BUZZ");
    	// 	}
    	// 	else if(i%3==0){
    	// 		System.out.println("FIZZ");

    	// 	}
    	// 	else{
    	// 		System.out.println("X	");
    	// 	}
    		
    	
    }
}