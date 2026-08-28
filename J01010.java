import java.util.*;

public class J01010 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      char[] sj = s.toCharArray();
      int check = 1;
      for (int i = 0; i < s.length(); i++) {
        if (sj[i] == '8' || sj[i] == '9' || sj[i] == '0') {
          sj[i] = '0';
        } else if (sj[i] == '1') {
          sj[i] = '1';
        } else {
          System.out.println("INVALID");
          check = 0;
          break;
        }
      }
      if (check == 1) {
        long ans = Long.parseLong(new String(sj));
        if (ans == 0) {
          System.out.println("INVALID");
        } else System.out.println(ans);
      }
    }
  }
}
