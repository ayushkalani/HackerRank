package hackerank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public static boolean Palindrome(String str){

    int start = 0;

    int end = str.length() - 1;

    int half = end/2;

     
    for(int i = 0; i < half; i++, start++, end-- ){

        if(str.charAt(start) != str.charAt(end))

            return false;
    }

    return true;

}
public class LoveLetterPalindrom {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test=sc.nextInt();
		
		for (int i = 0; i < test; i++) {
			String str  = br.readLine();
			if(Palindrome(str)==true)
			{
				System.out.println("0");
			}
			else{
				
			}
		}

	}
}
}


