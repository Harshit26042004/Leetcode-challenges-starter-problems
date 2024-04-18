import java.util.Scanner;
import java.lang.*;

public class RamanujanNumber {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            int count = 0;
            int n = (int) Math.cbrt(a);
            for (int i = 1; i <= n; i++) {
                int temp = a - (i * i * i);
                int b = (int) Math.cbrt(temp);
                if ((b * b * b) + (i * i * i) == a) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
}
