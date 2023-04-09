/*
@ n- the number programm must check 
@findPrime- function which returns true/false 
@Math.sqrt()-method which gave to programm square root value of our input "n"


*/


import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (findPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Composite");
            }
        }

        public static boolean findPrime(int n) {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


