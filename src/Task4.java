import java.util.*;
import java.util.Scanner;
import java.util.stream.*;
import java.math.BigInteger;
public class Task4 {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            findFactorial(n);

        }
        public static int findFactorial(int n){
            if (n == 1) {
                return 1;
            }
            if (n == 0) {
                return 1;
            }

            return n * findFactorial(n - 1);
    }}


