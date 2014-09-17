///////////////////////////////////////////////////////////////////////////////////////
//Dhruv Bajoria
//CSE-002
//09/16/2014
//Homework 3
//Bicycle Java Program
//This program calculates the distace travelled and the miles per hour

//  first compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle

// required for imports
import java.util.Scanner;


//  define a class
public class Bicycle {
// add main method 
     public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int secs = myScanner.nextInt();
        System.out.print("Enter the number of counts: ");
        int counts = myScanner.nextInt();
        
//Diameter of the wheel
        double wheelDiameter = 27.0;
//The numerical value of PI
        double PI = 3.14159;
//Number of feets in a mile used to calculate in the program    
        double feetPerMile = 5280;
//Number of inches in a foot used to calcuate in the program      
        double inchesPerFoot = 12;
        
//Computing outputs without moving decimals
        double distance = counts * wheelDiameter * PI / inchesPerFoot / feetPerMile;
        double time = secs / 60;
        double mph = distance / time * 60;
        
//Printing numbers with correct decimal points
        double a = (int) (distance * 100);
        double b = (int) (time * 10);
        double c = (int) (mph * 100);
    
//Print out the output data
        System.out.println ("The distance was " + (a / 100) + " miles and took " + (b / 10) + " minutes.");
        System.out.println ("The average mph was " + (c / 100));
         
     }  
//end of main method
         
}  
//end of class