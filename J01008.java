import java.util.*;

public class J01008 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int i = 1;
    while (t > 0) {
      long n = sc.nextLong();
      System.out.printf("Test %d: ", i);
      i++;
      for (int j = 2; j <= (int) Math.sqrt(n); j++) {
        int count = 0;
        while (n % j == 0) {
          n /= j;
          count += 1;
        }
        if (count > 0) {
          System.out.printf("%d(%d) ", j, count);
        }
      }
      if (n > 1) {
        System.out.printf("%d(1)", n);
      }
      System.out.println("");
      t--;
    }
    sc.close();
  }
}
