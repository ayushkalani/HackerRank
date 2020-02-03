package test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class removeDps {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String a =
        "Started GET       \"/terminal/\"  127.0.187.9890 ao9sdukn Tue Dec 01 19:51:04 +0530 2015 ";
    Pattern pForRelativeUrl = Pattern.compile("^.*(\".*\")");
    Matcher m = pForRelativeUrl.matcher(a);
    Pattern pForIpAddress = Pattern.compile(".*\\s+(\\d{1,3}[.]\\d{1,3}[.]\\d{1,3}[.]\\d{1,3}).*");
    while (m.find()) {
      System.out.println(m.group(1));
    }

    Matcher m1 = pForIpAddress.matcher(a);
    while (m1.find()) {
      System.out.println(m1.group(1));
    }
  }

}
