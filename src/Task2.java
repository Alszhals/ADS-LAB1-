/**
@findeaverage- function findout average value
@ n- array name
@ l- array lenght
@ return -gives back
@ IntStream.of(n)- creating IntStream which is contain the element n
@ average()-calculate the average number 
@.orElse(Double.NaN)-return average value if it's exists

*/



import java.util.stream.*;
public class Task2 {
    public static double findeaverage(int[] n,int l){
        if(l==0){
            return n[0];
        }
        else{
            double avr=average(n,l-1);
            return IntStream.of(n).average().orElse(Double.NaN);
        }

    }
}
