import java.util.stream.*;
public class Task2 {
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
