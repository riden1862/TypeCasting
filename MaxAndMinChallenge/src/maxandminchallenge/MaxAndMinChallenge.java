/*
Riley Denoon
MaxAndMinChallenge
April 24th 2020
 */
package maxandminchallenge;

/**
 *
 * @author riley
 */
public class MaxAndMinChallenge {
   /**
    * This method takes integers, and uses the integer arraySize 
    * to produce an array that holds ten randomized values the array
    * is being returned back to the main
    */
    public static int [] randomArray (int arraySize){
        //declare the array, holds ten values 
        int randomNumbers[] = new int [10];
        //Keep adding another to the array until it has held positions 0-9
        for (int i = 0; i <=arraySize - 1; i++){
            //use the math.random function to produce the random numbers 
            randomNumbers[i] = (int)(Math.random() * 100 + 1);
        }
        //return the array back to the main program
        return randomNumbers;
    }
    /**
     * This method is used to output the welcome method to the user
     * no data is being passed back to the main method
     */
    public static void welcomeUser(){
        //print the welcome message to the user 
        System.out.println("Welcome to the Max and Min Challenge program!");
        System.out.println("This program will store 10 random numbers between 1-100");
        System.out.println("Then determine the maximum and minimum of the array"); 
        System.out.println("Here are the ten numbers that have been generated");
        System.out.println("----------------------------------------------------");    
    }
    /*
    *This method takes an integers from the array and uses a loop to check
    *if each value is greater than the previous of the array
    */
        public static int getMaxValue (int [] randomNumbers){
          //declare variables 
          int maxValue;
          final int arraySize  = 10;
          maxValue = randomNumbers[0];
          //Use a for loop to go through the entire array
          for (int i = 0; i<arraySize;i++){
                //if the array at any position is greater than the max 
                if (randomNumbers[i]> maxValue){
                    //set the max value to that value of the array
                    maxValue = randomNumbers[i];
                }
          }
          System.out.println(maxValue);
          //return the maxValue back to the main program
          return maxValue;
        }
        /*
        *This method takes integers from the randomNumbers array and uses a loop to
        *check if each value is less than the previous of the array
        */
        public static int getMinValue (int [] randomNumbers) {
            //declare variables
            int minValue;
            final int arraySize = 10;
            minValue = randomNumbers[0];
            for (int i = 0; i<arraySize; i++){
                //if the array at any position is less than the min 
                if (randomNumbers[i]<minValue){
                    //set the min value to that value of the array
                    minValue = randomNumbers[i];
                }
            }
            //return the minValue back to the main 
            return minValue;
        }
        /*This method takes integers from the array and prints them in the text
        *interface
        */
        public static int printArray (int [] randomNumbers){
            //Declare the constant of 10
            int arrayValues =10;
            /**Use the for loop to count and display all the places held in 
             * randomNumbers []
             */
            for (int i = 0; i<arrayValues; i++){
                //Display the number in randomNumbers[]
                System.out.println(randomNumbers[i]);
            }
            //return arrayValues back to the main program
            return arrayValues;
        }
        
    public static void main(String[] args) {
        int randomNumbers[] = randomArray(10);
        //call the welcomeUser method 
        welcomeUser();
        //call the array to be printed on the screen,by calling the method
        System.out.println(printArray(randomNumbers));
        //tell the user the largest number and call getMaxValue method
        System.out.println("This is the largest of the numbers: " +getMaxValue(randomNumbers));
        //tell the user the smallest number and call getMinValue method
        System.out.println("This is the smallest of the numbers: " +getMinValue(randomNumbers));
        //Ending message to the user to show completion 
        System.out.println("Thank you for using the Max and Min Challenge!");
    }
    
}
