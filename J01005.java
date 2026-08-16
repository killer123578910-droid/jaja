import java.util.*;

// ta có S=1/2*H*1=H/2.
// chia S thành n phần=> mỗi phần So=H/2N
// tại đường cắt thứ k, tam giác phía trên chia thành k phần nhỏ
// Sk=k*S0=kH/2N
// các chia các hình thành k phần -> ta có k các tam giác nhỏ đồng dạng với hệ số k
// -> tỉ lệ chiều cao=hk(độ dài đường cao của tam giác thứ k hay chính là khoảng cách từ đỉnh tới
// đường cắt k)/H
// tỉ lệ diện tích(đồng dạng thì S phải bình phương)=(SK/S)^2
// thay kH/2N, H/2 giải ra ta có:
// hk=H*sqrt(k/n)(công thức)
public class J01005 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0) {
      long n = sc.nextLong();
      long h = sc.nextLong();
      for (int i = 1; i < n; i++) {
        System.out.printf("%.6f ", h * Math.sqrt((double) i / n));
      }
      System.out.println();
      t--;
    }
    sc.close();
  }
}
