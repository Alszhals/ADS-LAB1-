import java.util.Scanner;
import java.util.stream.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int in = sc.nextInt();
        int[] n=new int[in];
        for(int i=0;i<in;i++){
            n[i]=sc.nextInt();}
        double avr=findeAverage(n,n.length);
        System.out.print(avr);
    }
    public static double findeAverage(int[] n,int l){
        if(l==0){
            return n[0];
        }
        else{
            double avr=findeAverage(n,l-1);
            return IntStream.of(n).average().orElse(Double.NaN);
        }

    }
}