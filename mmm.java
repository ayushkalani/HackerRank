package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mmm {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine().toLowerCase();
    String[] inputa = input.split("");
    int indexS = 0;
    int indexL = inputa.length -1;
    while (indexS < indexL) {

        
      if (inputa[indexS] != "a" || inputa[indexS] != "e" || inputa[indexS] != "i"
          || inputa[indexS] != "o" || inputa[indexS] != "u") {
        indexS++;
        continue;
      }
      else{
        for(int i=indexL;i>indexS;i--){
          if (inputa[i] != "a" || inputa[i] != "e" || inputa[i] != "i"
              || inputa[i] != "o" || inputa[i] != "u") {
            indexL--;
          }
          else{
          String temp = "";
          temp = inputa[indexS];
          inputa[indexS] = inputa[indexL];
          inputa[indexL] = temp;}
        }
        
      }
     
      
      
      indexS++;
      indexL--;
    }

    
    for(String k: inputa){
      System.out.print(k);
    }
  }
}
