import java.io.*;
import java.util.*;

public class Panagram{
	  public static boolean isPangram(String test){
        for (char a = 'A'; a <= 'Z'; a++)
            if ((test.indexOf(a) < 0) && (test.indexOf((char)(a + 32)) < 0))
                return false;
        return true;
    }
    public static void main(String[] args)throws IOException{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	if(isPangram(br.readLine().toUpperCase())){
    			System.out.println("pangram");
    	}
    	else{
    	     System.out.println("not pangram");
    	} 
    }
}