/*
 Riley Denoon
MyFirstSubroutineProgram
April 18th 2020
 */
package myfirstsubroutineprogram;

import java.util.Scanner;

/**
 *
 * @author melanie
 */
public class MyFirstSubroutineProgram {
    //bring the scanner into the program
    static Scanner keyedInput = new Scanner (System.in);
    //declare variables 
     static int choice =0;
     static int num1;
     static int num2;
     static int num3;
     static int num4 =180;
     
    public static void main(String[] args) {
        do {
            //prompt the user with the menu for an answer
            System.out.println("_______________________________________________");
            System.out.println("Hello! Welcome to my first subroutine program!");
            System.out.println("This is the main menu");
            System.out.println("===============================================");
            System.out.println("1, find the perimeter of a rectangle");
            System.out.println("2, find the area of a rectangle");
            System.out.println("3, find the sum of two numbers");
            System.out.println("4, find the square root of a number");
            System.out.println("5, find a missing angle on a triangle");
            System.out.println("6, to terminate the program");
            //use a scanner to determine what the user wants to do
            choice = keyedInput.nextInt();
            //use an if statement to output the correct answer
            if (choice == 1){
                //take the chosenValues
                chosenValues ();
                //print the answers to the user 
                System.out.println("The perimeter is " + perimeterAndOut(num1, num2));
            }
            //use an if statement to ouput the correct answer 
            if (choice ==2){
                //take the chosenValues
                chosenValues();
                //print the answer to the user 
                System.out.println ("The area is " + areaAndOut(num1, num2));
            }
            //user an if statement to output the correct answer 
            if (choice ==3){
                //take the chosenValues
                chosenValues();
                //print the answer to the user 
                System.out.println("The sum is " + addAndOut(num1, num2));
            }
            //use an if statement to output the correct answer 
            if (choice ==4){
                //take the chosenValues
                singleValue();
                //print the answer to use user 
                System.out.println("The square root is " +sqrtAndOut(num3));
            }
            //use an if staement to output the correct answer 
            if (choice ==5){
                //take the chosenValues
                chosenValues();
                //print the answer to the user 
                System.out.println("The missing angle is " +angleAndOut(num1, num2, num4));
            }
        } while (choice <6);
    }
           
            public static void chosenValues(){
                //prompt for the first number to be used 
                System.out.println("Enter the first number you wish to use");
                //number one is taken from the scanner, stored as an integer 
                num1 = keyedInput.nextInt();
                //propt for the second number to be used
                System.out.println("Enter the second number you wish to use");
                //number two is taken from the scanner, stored as an integer
                num2 = keyedInput.nextInt();
            }
            public static void singleValue(){
                //prompt the user for ONLY number it'll use 
                System.out.println("Enter the number you would like to use");
                //number is taken from the scanner, stroed as an integer 
                num3 = keyedInput.nextInt();
            }
                //now create the subroutine perimeterAndOut
                public static int perimeterAndOut (int n1, int n2){
                   //declare variable
                    int perimeter;
                    //preform calculation
                    perimeter = n1+n1+n2+n2;
                    //return back to the main
                    return perimeter;       
                }
                public static int areaAndOut (int n1, int n2){
                   //declare variable
                   int area;
                   //preform calculation 
                   area = n1 * n2;
                   //return back to main
                   return area;
                }
                public static int addAndOut (int n1, int n2){
                    //declare variable
                    int sum;
                    //preform calculation
                    sum = n1 + n2;
                    //return back to main
                    return sum;
                }
                public static int sqrtAndOut (double n3){
                    //declare variable 
                    double squareroot;
                    int rounded;
                    //preform calculation
                    squareroot = Math.sqrt(n3);
                    //round squareroot so it is an integer 
                    Math.round(squareroot);
                    //using another integer, represent the value of squareroot as an integer 
                    rounded = (int)squareroot;
                    return rounded;
                }
                public static int angleAndOut (int n1, int n2, int n4){
                    //declare variable
                    int remainingAngle;
                    //prefotm claculations
                    remainingAngle = n4 -n1 -n2;
                    //return to main
                    return remainingAngle;
                }
    
} 
