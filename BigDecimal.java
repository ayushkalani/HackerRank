import java.io.*;
import java.util.*;
import java.math.*;

class BigD{
	public static void main(String[] args) throws IOException{
		
		 Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
        List<BigDecimal> list = new ArrayList<BigDecimal>();

        while(sc.hasNext()){
            list.add(new BigDecimal(sc.next()));
        }

        Collections.sort(list, Collections.reverseOrder());

        for(BigDecimal d : list){

            System.out.println(d);
        }
    }

}
