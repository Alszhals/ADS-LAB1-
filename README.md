# ADS-LAB1-
## task2
***
public static double findeaverage(int[] n,int l){
   if(l==0){
   return n[0];
   }
   else{
   double avr=findeaverage(n,l-1);
   return IntStream.of(n).average().orElse(Double.NaN);
   }
   }
***


