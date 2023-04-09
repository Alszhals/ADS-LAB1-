/*
@binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k) decrise till kis equal 0 or n

*/



import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        System.out.println(binomialCoeff(n, k));
    }

    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
        }
    }
}

