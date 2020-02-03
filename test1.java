package test;

public class test1 {

  public static boolean isPalin(String s) {
    if (s.length() % 2 != 0) {
      s = s.substring(0, s.length() / 2) + s.substring((s.length() / 2) + 1);
    }
    return new StringBuffer(s.substring(0, s.length() / 2)).reverse().toString()
        .equals(s.substring(s.length() / 2));
  }

  public static void main(String[] args) {
    long b = 0L;
    int f1 = 0, f2 = 2;
    for (int i = 999; i > 0; i--) {
      for (int j = 999; j > 0; j--) {
        if (isPalin(new Long(i * j).toString())) {
          if (i * j > b) {
            f1 = i;
            f2 = j;
            b = i * j;
          }
        }
      }
    }
    System.out.println(f1 + "*" + f2);
    System.out.println(b);
  }
}
