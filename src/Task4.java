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
            int fact =1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.print(fact+" ");
            return fact;
        }
    }


