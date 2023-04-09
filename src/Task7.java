/*
@size- the input element amount of array 
@array-array
@fisrt for loop  to fill the array 
@secound for loop to print the each element of array 
@  reverseArray(array, startIndex + 1, endIndex - 1)- swap the elemets till "startIndex " greater or equal to "endIndex"

*/


import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int size =sc.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            reverseArray(array, 0, size - 1);
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
    }

    public static void reverseArray(int[] array, int startIndex, int endIndex) {
            if (startIndex >= endIndex) {
                return;
            }
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            reverseArray(array, startIndex + 1, endIndex - 1);
        }
    }


