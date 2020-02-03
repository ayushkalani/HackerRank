package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class hackerarthServerLogAnallysis {
  public static Pattern request = Pattern.compile("");

  public static boolean extractRequest(String a, String reqType) {
    if (a.startsWith("Started")) {
      a.contains(reqType);
    }
    return false;
  }

  public static void main(String[] args) throws IOException {
    final String seprator = "***************###############***************";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<String> filters = new ArrayList<>();
    String line;

    while ((line = br.readLine()) != null) {
      if (line.startsWith(seprator)) {
        while ((line = br.readLine()) != null) {
          filters.add(line);
        }
        break;
      } else {

      }
    }
    for (String i : filters)
      System.out.println(i);
  }
}
