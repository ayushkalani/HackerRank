import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Enc {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine().replaceAll("\\s+","");
		int rows=(int)Math.floor(Math.sqrt(str.length()));
		 int cols = (int) Math.ceil(Math.sqrt(str.length()));
        if (str.length() > rows * cols)
            rows = (int) Math.ceil(Math.sqrt(str.length()));
		int diff=(rows*cols)-(str.length());
		char[][] arr=new char[rows][cols];
		int k=0;
		for (int i=0;i<rows ;i++ ) {
			for (int j=0;j<cols ;j++ ) {
				if(k<(rows*cols)-diff){
					arr[i][j]=str.charAt(k);
					k++;
				}
					}
					}
		for (int j=0 ;j<cols ;j++) {
			for (int i=0;i<rows ;i++ ) {
				if(arr[i][j]!=0)
				System.out.print(arr[i][j]);
			}
			System.out.print(" ");
		}
	}
	}
