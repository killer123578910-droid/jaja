import java.util.*;

public class J01009 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 0;
    long[] dp = new long[n + 1];
    if (n == 0) {
      System.out.println(0);
    } else if (n == 1) {
      System.out.println(1);
    } else {

      dp[1] = 1;
      dp[0] = 0;
      sum = 1;
      for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] * i;
        sum += (dp[i]);
      }
      System.out.println(sum);
    }
  }
}
