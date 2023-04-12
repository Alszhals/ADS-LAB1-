/*
@inputString.isEmpty()- check is the String empty
@Character.isDigit(inputString.charAt(0)))- check is the first element digit 
@return checkDigits(inputString.substring(1))- recall function to check next elements
@charAt(0)- method in String class that returns certain char of string in this case first 
@substring(1)- remove the first char of string and return it with out it 

*/



import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String inputString = input.nextLine();
            if (checkDigits(inputString)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

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
    }


