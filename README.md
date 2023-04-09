# ADS-LAB1-
## task2
***java
*  public static double findeaverage(int[] n,int l){
   if(l==0){
   return n[0];
   }
   else{
   double avr=findeaverage(n,l-1);
   return IntStream.of(n).average().orElse(Double.NaN);
   }

   }
***
__The base case of the recursion is when l equals 0, in which case the function simply returns the first element of the input array n.

For all other values of l, the function recursively calculates the average of the first l - 1 elements of the input array by calling itself with l - 1 as the new value of l.

Once the recursive call returns, the function calculates the average of the entire l elements of the input array by calling the average method of the IntStream class on the input array n.

Finally, the function returns the calculated average as a double value.__

