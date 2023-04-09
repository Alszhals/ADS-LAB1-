import java.util.Scanner;
import java.util.stream.*;
import java.math.BigInteger;
public class Task5 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt(); // number of terms to generate
            System.out.print(fibonacci(n));
        }

        public static int fibonacci(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }

        }
}
