package test;


public class q2 {

  public static void main(String[] args) {
    int[] arr = {-3, -2, -1, 5, 6, 7, 9, 11, 12, 13, 14, 15, 16};
    //int[] arr = { 12, 13, 14, 15, 16, 17};
    String response = null;
    StringBuffer sb = new StringBuffer();
    int i = 0;
    while (i < arr.length) {
      int count = 0;
      int j = i + 1;
      int r = i;
      while (j < arr.length) {
        if (arr[j] == arr[i] + 1) {
          count++;
          i++;
          j++;
        } else {
          break;
        }
      }
      if (count >= 2) {
        sb.append(arr[r] + "-");
        if (j - 1 != arr.length - 1) {
          sb.append(arr[j - 1] + ",");
        } else {
          sb.append(arr[j - 1]);
        }
        i = j;
      } else if (i != arr.length) {
        sb.append(arr[r] + ",");
        i = r + 1;
      } else {
        sb.append(arr[r]);
        i = r + 1;
      }
    }
    System.out.println(sb.toString());

  }
}
