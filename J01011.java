import java.util.*;

public class J01011 {
  static long bcd(long a, long b) {
    return (long) a * b / gcd(a, b);
  }

  static long gcd(long a, long b) {
    return b == 0 ? a : gcd(b, a % b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long a = sc.nextLong();
      long b = sc.nextLong();
      System.out.println(bcd(a, b) + " " + gcd(a, b));
    }
  }
}
