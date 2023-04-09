/*
@a*findDegree(a,n-1))- decrise the n till its 



*/import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a =sc.nextInt();
            int n =sc.nextInt();
            System.out.println( findDegree(a, n));
        }

        public static int findDegree(int a, int n) {
            if(n==0){
                return 1;}
            else{
                return(a*findDegree(a,n-1));
            }
        }
    }


