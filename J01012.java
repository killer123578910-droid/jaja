import java.util.*;

public class J01012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      int count = 0;
      for (int i = 1; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          if (i % 2 == 0) {
            count += 1;
          }

          if (i * i != n) {
            if ((n / i) % 2 == 0) {
              count += 1;
            }
          }
        }
      }
      System.out.println(count);
    }
  }
}
