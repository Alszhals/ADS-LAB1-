import java.util.*;
import java.util.Scanner;
import java.util.stream.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int in = sc.nextInt();
        int[] n=new int[in];
        for(int i=0;i<in;i++){
            n[i]=sc.nextInt();}
        double avr=average(n,n.length);
        System.out.print(avr);


    }
    public static double average(int[] n,int l){
        if(l==0){
            return n[0];
        }
        else{
            double avr=average(n,l-1);
            return IntStream.of(n).average().orElse(Double.NaN);
        }

    }
}


   /* static int minimum(int in){
        Scanner sc= new Scanner(System.in);
        int min=0;
        int[] n=new int[in];
        for(int i=0;i<in;i++){
            n[i]=sc.nextInt();
            if (n[i]<min){
                min=n[i];}
        }
        System.out.print(min);
        return min ;
    }*/
  /* static double av(int in )
   {
       Scanner sc=new Scanner(System.in);
       double sum = 0;
       int[] n=new int[in];
       for(int i=0;i<in;i++){
           n[i]=sc.nextInt();
           sum=sum+n[i];
       }
       System.out.print (sum/n.length);
       return 0;
   }*/
