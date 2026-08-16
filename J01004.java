import java.util.*;

public class J01004 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      int ans = 0;
      long n = sc.nextLong();
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          ans = 1;
          break;
        }
      }
      System.out.println((ans == 0 ? "YES" : "NO"));
      t--;
    }
    sc.close();
  }
}
