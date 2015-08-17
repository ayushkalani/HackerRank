import java.io.*;
import java.util.*;
public class maxsubarray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();

		}
		contigousArray(arr,n);
		noncontiArray(arr,n);
			
	}

	public static int contigousArray(int a[],int n){
		int current_sum=0;
		int best_sum=0;
		int val=0;
		int current_index=-1;
		int best_start_index=-1;
		int best_end_index=-1;
		for(int i=0	;i<n;i++){
			val=current_sum+a[i];
			if(val>0)
			{
				if(current_sum==0)
					current_index=i;
				current_sum=val;

			}
			else{
				current_sum=0;
			}
			if(current_sum>best_sum){
					best_sum=current_sum;
					best_start_index=current_index;
					best_start_index=i;
			}
		}
		int sum=a[best_start_index]+a[best_end_index+1];
		return sum;
	} 
	public static int noncontiArray(int b[],int n){

	}
}