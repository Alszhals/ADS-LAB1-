# ADS-LAB1-
## task2
__Explanation:__
***
The base case of the recursion is when l equals 0, in which case the function simply returns the first element of the input array n.

For all other values of l, the function recursively calculates the average of the first l - 1 elements of the input array by calling itself with l - 1 as the new value of l.

Once the recursive call returns, the function calculates the average of the entire l elements of the input array by calling the average method of the IntStream class on the input array n.

Finally, the function returns the calculated average as a double value._
***
```java
public static  double findeaverage(int[] n,int l){
   if(l==0){
   return n[0];
   }
   else{
   double avr=findeaverage(n,l-1);
   return IntStream.of(n).average().orElse(Double.NaN);
   }}

   
```

***

## Task3
__Explanation:__
***
The given Java code defines a function named findPrime that takes an integer n as input and returns a boolean value indicating whether n is a prime number or not.

Here's how the function works:

The function first checks if the input integer n is less than 2. If n is less than 2, it is not a prime number, so the function returns false.

If n is greater than or equal to 2, the function proceeds to loop through all integers i from 2 to the square root of n. This loop is used to check if any integer between 2 and the square root of n divides n evenly (i.e., leaves no remainder). If such an integer is found, it means that n is not a prime number, and the function returns false.

If the loop completes without finding any integer that divides n evenly, it means that n is a prime number, and the function returns true.

The Math.sqrt method is used to calculate the square root of n, which is used as the upper bound of the loop.

The implementation of the findPrime function is correct and will correctly determine whether an input integer n is a prime number or not.
***
```agsl
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
```

## task4
__Explanation:__
The function first checks if the input integer n is equal to 1. If n is equal to 1, it means that the factorial of n is 1, so the function returns 1.

The function then checks if the input integer n is equal to 0. If n is equal to 0, it means that the factorial of n is 1, so the function returns 1.

If n is neither 1 nor 0, the function recursively calls itself with n-1 as the input and multiplies the result with n.

This recursion continues until the base cases (i.e., n = 1 or n = 0) are reached.

Finally, the function returns the computed factorial of n.

The implementation of the findFactorial function is correct and will correctly calculate the factorial of an input integer n.
***
```agsl
   public static int findFactorial(int n){
            if (n == 1) {
                return 1;
            }
            if (n == 0) {
                return 1;
            }
            return n * findFactorial(n - 1);
    }
```
***

## task5
__Explanation:__
The function first checks if the input integer n is equal to 0. If n is equal to 0, it means that the nth number in the Fibonacci sequence is 0, so the function returns 0.

The function then checks if the input integer n is equal to 1. If n is equal to 1, it means that the nth number in the Fibonacci sequence is 1, so the function returns 1.

If n is neither 0 nor 1, the function recursively calls itself with n-1 and n-2 as the input and adds the results.

This recursion continues until the base cases (i.e., n = 0 or n = 1) are reached.

Finally, the function returns the computed nth number in the Fibonacci sequence.

The implementation of the fibonacci function is correct and will correctly calculate the nth number in the Fibonacci sequence for an input integer n. However, note that the function is not very efficient and can be slow for large values of n due to the repeated recursive calls.




***
```agsl
public static int fibonacci(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }

        }
```
***
## task6
__Explanation:__
The function first checks if the input integer n is equal to 0. If n is equal to 0, it means that the value of a raised to the power of n is 1, so the function returns 1.

If n is not equal to 0, the function recursively calls itself with a and n-1 as the input, and multiplies the result of this recursive call by a.

This recursion continues until the base case (i.e., n = 0) is reached.

Finally, the function returns the computed value of a raised to the power of n.

The implementation of the findDegree function is correct and will correctly calculate the value of a raised to the power of n for the given input integers a and n. However, note that the function is not very efficient and can be slow for large values of n due to the repeated recursive calls. There are more efficient algorithms for computing powers, such as binary exponentiation.
***
```agsl
  public static int findDegree(int a, int n) {
            if(n==0){
                return 1;}
            else{
                return(a*findDegree(a,n-1));
            }
        }
```
***


## task7
__Explanation:__
The function first checks if the startIndex is greater than or equal to endIndex. If it is, the function simply returns without doing anything. This is the base case for the recursion.

If the base case is not met, the function swaps the elements at the startIndex and endIndex positions in the array by creating a temporary variable temp to store the value of the element at startIndex, assigning the value of the element at endIndex to the element at startIndex, and then assigning the value of temp to the element at endIndex. This effectively reverses the order of the two elements.

The function then recursively calls itself with the input array, the startIndex increased by 1, and the endIndex decreased by 1. This continues until the base case is reached.
***
```agsl
 public static void reverseArray(int[] array, int startIndex, int endIndex) {
            if (startIndex >= endIndex) {
                return;
            }
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            reverseArray(array, startIndex + 1, endIndex - 1);
        }
```
***


## task8
__Explanation:__
The function first checks if the input string is empty. If it is, the function returns true. This is the base case for the recursion.

If the input string is not empty, the function checks if the first character of the string is a digit by calling the Character.isDigit method on the character at index 0 of the input string. If it is a digit, the function recursively calls itself with the substring of the input string starting from index 1. This effectively checks all remaining characters in the input string.

If the first character of the input string is not a digit, the function immediately returns false, since not all characters in the input string are digits.

The function continues to recursively call itself on smaller and smaller substrings of the input string until it either finds a non-digit character or reaches the end of the string.
***
```agsl
public static boolean checkDigits(String inputString) {
            if (inputString.isEmpty()) {
                return true;
            }
            if (Character.isDigit(inputString.charAt(0))) {
                return checkDigits(inputString.substring(1));
            } else {
                return false;
            }
        }
```
***

## task9
__Explanation:__
The function first checks if k is equal to 0 or n. If it is, the function immediately returns 1. This is because there is only one way to choose 0 items or n items from a set of n items.

If k is not equal to 0 or n, the function recursively calls itself twice with n-1 and k-1, and with n-1 and k. This calculates the number of ways to choose k-1 items from a set of n-1 items and the number of ways to choose k items from a set of n-1 items. The two results are added together to give the final result.

The function continues to recursively call itself on smaller and smaller values of n and k until it reaches the base case of k=0 or k=n.
***
```agsl
   public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
        }
```
***

## task10
__Explanation:__
If b is zero, then the GCD of a and b is a. Otherwise, the GCD of a and b is the same as the GCD of b and a % b. This recursive call is repeated until b is zero, which means the algorithm has found the GCD of a and b.
***
```agsl
public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
```
***


