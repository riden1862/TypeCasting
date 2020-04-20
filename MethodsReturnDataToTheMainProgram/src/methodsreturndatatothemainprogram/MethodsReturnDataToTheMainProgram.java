/*
Riley Denoon
MethodsReturnDataToTheMainProgram
April 19th 2020
 */
package methodsreturndatatothemainprogram;

import java.util.Scanner;

/**
 *
 * @author melanie
 */
public class MethodsReturnDataToTheMainProgram {
        //show the scanner, scanner gets they keyed input 
        static Scanner keyedInput = new Scanner (System.in);
        //declare variables 
        static int num1;
        static int num2;
        static int num3;
        static int num4 = 180;
        static double num5;
        
        
     public static void main(String[] args) {
       //create a do while loop, so all of the options can be filed through
     
       do {
           //Use an if statement to execute the right piece of code
           if (menuList() == 1){
                //take the chosenValues
                twoValues ();
                //print the answers to the user 
                System.out.println("The perimeter is " + perimeterAndOut(num1, num2));
           }
           //Use an if statement to execute the right piece of code
           if (menuList()==2){
               //take the chosenValues
               twoValues();
               //print the answers to the user 
               System.out.println("The area is " + areaAndOut(num1, num2));
           }
           //Use an if statement to execute the right piece of code
           if (menuList() ==3){
                //take the chosenValues
                twoValues();
                //print the answer to the user 
                System.out.println("The sum is " + addAndOut(num1, num2));
            }
            //Use an if statement to execute the right piece of code
            if (menuList() ==4){
                //take the singleValue
                oneDoubleValue();
                //print the answer to use user 
                System.out.println("The square root is " +sqrtAndOut(num5));
            }
            //Use an if statement to execute the right piece of code
            if (menuList() ==5){
                //take the chosenValues
                twoValues();
                //print the answer to the user 
                System.out.println("The missing angle is " +angleAndOut(num1, num2, num4));
            }
            //Use an if staement to execute the right piece of code 
            if (menuList() ==6){
                //take the chosen values 
                twoValues();
                //print the answer to the user
                System.out.println("The largest of the numbers is " +maxAndOut(num1, num2));
            }
            //Use an if staement to execute the right piece of code 
            if (menuList() ==7){
                //take the chosen values
                twoValues();
                //print the answer to the user 
                System.out.println("The smallest if the two numbers is " +minAndOut(num1, num2));
            }
            //Use an if staement to execute the right piece of code 
           if (menuList() ==8){
               //take the chosen value
               oneDoubleValue();
               //print the answer to the user 
               System.out.println("The absolute value of the number is "+ absAndOut(num5));
           }
           //Use an if staement to execute the right piece of code 
           if (menuList() ==9){
               //take the chosen value
               oneDoubleValue();
               //print the answer to the user 
               System.out.println("The cube root of the number is "+cubeAndOut(num5));
           }
           //Use an if staement to execute the right piece of code 
           if (menuList() ==10){
               //take the chosen value
               oneValue();
               //print the answer to the user 
               System.out.println("The number to the power of two is "+powerAndOut(num1));
           }
       } while (menuList() <11);
 }
            public static int menuList (){
            //declare the variable
            int input; 
            //output to the user all of the avaliable options
            System.out.println("-----------------------------------------------");
            System.out.println("Hello! Welcome to my methods program!");
            System.out.println("This is the main menu, type the number to select a choice");
            System.out.println("===============================================");
            System.out.println("1, find the perimeter of a rectangle");
            System.out.println("2, find the area of a rectangle");
            System.out.println("3, find the sum of two numbers");
            System.out.println("4, find the square root of a number");
            System.out.println("5, find a missing angle on a triangle");
            System.out.println("6, find the maximum of the two numbers");
            System.out.println("7, find the minimum of the two numbers");
            System.out.println("8, find the absolute value of a number");
            System.out.println("9, find the cube root of a number");
            System.out.println("10, find number to the power of two");
            System.out.println("11, to terminate the program");
            //the user input will be retrieved from the scanner, as an integer 
            input = keyedInput.nextInt();
            //return to the main 
            return input;
        }
           /* this method will be used for any part of the menu that has two 
            parameters being used. 
            */
        public static void twoValues(){
                //prompt for the first number to be used 
                System.out.println("Enter the first number you want to use");
                //number one is taken from the scanner, stored as an integer 
                num1 = keyedInput.nextInt();
                //propt for the second number to be used
                System.out.println("Enter the second number you want to use");
                //number two is taken from the scanner, stored as an integer
                num2 = keyedInput.nextInt();
        }
        /* this method will be used for any part of the menu that has only one
        parameter to be used.
        */
         public static void oneValue(){
                //prompt the user for ONLY number it'll use 
                System.out.println("Enter the number you want to use");
                //number three is taken from the scanner, stored as an integer 
                num3 = keyedInput.nextInt();
         }
         public static void oneDoubleValue(){
             //propt the user for one value
             System.out.println("Enter the number you want to use");
             //number five is taken from the scanner, stored as a double
             num5 = keyedInput.nextDouble();
         }
        /* perimeterAndOut accepts two parameters to be both added twice, 
        then all together to find the perimeter. 
        */
              public static int perimeterAndOut (int n1, int n2){
                   //declare variable
                    int perimeter;
                    //preform calculation
                    perimeter = n1+n1+n2+n2;
                    //return back to the main
                    return perimeter;       
              }
              /*areaAndOut accepts two parameters and multiplies them together
              then returns it back to the method
              */
              public static int areaAndOut (int n1, int n2){
                   //declare variable
                   int area;
                   //preform calculation 
                   area = n1 * n2;
                   //return back to main
                   return area;
                }
              /*addAntOut accepts two parameters and adds them together to
              determine the sum, then is returned to the method
              */
                public static int addAndOut (int n1, int n2){
                    //declare variable
                    int sum;
                    //preform calculation
                    sum = n1 + n2;
                    //return back to main
                    return sum;
                }
                /*sqrtAndOut accepts only one parameter, and uses the 
                Math.sqrt to determine the value and then sends it back to the
                method
                */

                public static double sqrtAndOut (double n5){
                    //declare variable 
                    double squareroot;
                    //preform calculation
                    squareroot = Math.sqrt(n5);
                    return squareroot;
                }
                /* angleAndOut accepts two parameters, and using a
                pre-existing value finds the one unknown
                */
                public static int angleAndOut (int n1, int n2, int n4){
                    //declare variables
                    int remainingAngle;
                    //preform claculations
                    remainingAngle = n4 -n1 -n2;
                    //return to main
                    return remainingAngle;
                }
                /*maxAndOut accepts two parameters, and using a predefined math 
                method finds which number is the largest
                */
                public static int maxAndOut (int n1, int n2){
                    //declare variable
                    int max;
                    //preform calculation
                    max = Math.max(n1, n2);
                    //return to main
                    return max;
                }
                public static int minAndOut(int n1, int n2){
                    //declare variabel
                    int min;
                    //preform calculation
                    min = Math.min(n1, n2);
                    //return to main
                    return min;
                }
                public static double absAndOut (double n5){
                    //declare variable 
                    double absolute;
                    //preform calculation
                    absolute = Math.abs(n5);
                    //return to main
                    return absolute;
                }
                public static double cubeAndOut(double n5){
                    //declare variable
                    double cubeRoot;
                    //preform calculation
                    cubeRoot = Math.cbrt(n5);
                    //return to main
                    return cubeRoot;
                }
                public static int powerAndOut(int n1){
                    //declare variable
                    int powerOfTwo;
                    //perform calculation
                    powerOfTwo = n1 * n1;
                    //return to main
                    return powerOfTwo;
                }
}
