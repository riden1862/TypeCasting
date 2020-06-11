/*
Riley Denoon
Type Casting
Edited June 10th 2020
 */
package type.casting;

import java.util.Scanner;

/**
 *
 * @author riley
 */
public class TypeCasting {
     //import the scanner
    static Scanner keyedInput = new Scanner (System.in);
    //declare variables that are used 
     static int choice =0;
     static int integerPick;
     static int toInt;
     static double toDouble;
     static double doublePick;
     static char toChar;
     static char charPick;
     static String toString;
     static String stringPick;
     
     
    public static void main(String[] args) {
        //prompt the user to enter numbers 
        do {
            System.out.println("________________________________________________");
            System.out.println("Please enter a number to pick an option below");
            System.out.println("1, Enter an integer, to turn into a double");
            System.out.println("2, Enter a double, to turn into an integer");
            System.out.println("3, Enter a char, to turn into a string");
            System.out.println("4, Enter a string, to turn into a char");
            System.out.println("5, Enter a String to turn into an integer");
            System.out.println("6, Enter a String to turn into a double");
            System.out.println("7, To terminate the program");
            
            //use a scanner to get the input from the user 
            choice = keyedInput.nextInt();
            //use an if statement to find the correct subroutine 
            if (choice == 1){
                //call to the subroutine intToDouble 
              intToDouble(); 
            }
            if (choice == 2){
                //call to the subroutine doubleToInt 
                doubleToInt();
            }
            if (choice == 3){
                //call to the subroutine charToString
                charToString();
            }
            if (choice == 4){
                //call to the subroutine stringToChar
                stringToChar();
            }
            if (choice == 5){
                //call to the subroutine stringToInt
                stringToInt();
            }
            if (choice == 6){
                //call to the subroutine stringToDouble
                stringToDouble();
            }
        } while (choice < 7);
    } 
            public static void intToDouble(){
                  //Prompt the user for a integer 
               System.out.println("Please enter a integer");
               //use a scanner to determine the integer to use 
               integerPick = keyedInput.nextInt();
               //convert the integer value to a double 
               toDouble = (double)integerPick;
               //output the value the user entered as an integer, as a double 
               System.out.println("This is the integer to a double " + toDouble);
            }
            public static void doubleToInt(){
                //Prompt the user for a double
                System.out.println("Please enter a double");
                //use a scanner to determine the double to use
                doublePick = keyedInput.nextDouble();
                //convert the double to an integer 
                toInt = (int)doublePick;
                //output the value the user entered as a double, to an integer 
                System.out.println("This is the double to an integer " + toInt);
            }
            public static void charToString(){
                //Prompt the user to enter a char 
                System.out.println("please enter a char, remember only one letter!");
                /*use a scanner to determine the char to use, to do this pull the
                char from a string, using the zero position
                */
                charPick = keyedInput.next().charAt(0);
                //convert the char to a string, user string.valueOf()
                toString = String.valueOf(charPick);
                //output the value the user entered as a char, to a string
                System.out.println("This is the char to the string " + toString);
            }
            public static void stringToChar(){
                //Prompt thr user to enter a string
                System.out.println("Please enter a string");
                //use a scanner to determine the string to use 
                stringPick = keyedInput.next();
                //convert the string to a char 
                toChar = stringPick.charAt(0);
                //output the value to the user entered as a string, to a char
                System.out.println("This is the string to the char " + toChar);
            }
            public static void stringToInt(){
                //prompt the user to enter a string 
                System.out.println("Please enter a string");
                //use a scanner to determine the string to use 
                stringPick = keyedInput.next();
                //convert the string to an int 
                toInt = Integer.parseInt(stringPick);
                //output the value to the user entered as a string, to an integer 
                System.out.println("This is the string to an integer " + toInt);
            }
            public static void stringToDouble(){
                //prompt the user to enter a string
                System.out.println("Please enter a String");
                //use a scanner to determine the string to use 
                stringPick = keyedInput.next();
                //convert the string to the double
                toDouble = Double.parseDouble(stringPick);
                //output the value to the user entered as a string, to a double
                System.out.println("This is the string to a double " + toDouble);
            }
}
