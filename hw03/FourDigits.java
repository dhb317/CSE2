////////////////////////////////////////////////////////////////////////////////////////////////////
//Dhruv Bajoria
//CSE-002 
//09/12/2014
//Homework 03
//Four Digit Java Program
//This program prints out the first four digits to the right of the decimal point

//  first compile the program
//      javac FourDigits.java
//  run the program
//      java FourDigits

//Required for imports
import java.util.Scanner;

//  define a class
public class FourDigits {

//add main method 
     public static void main(String[] args) {
        
    Scanner myScanner;
    myScanner = new Scanner(System.in);
        
//Allows the users to enter a number
    System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
    double number = myScanner.nextDouble();
        
//Computes the four digits using their percentages 
    int Firstnumber = ((int) (number * 10)) % 10;
    int Secondnumber = ((int) (number * 100)) % 10;
    int Thirdnumber = (int) (number * 1000) % 10;
    int Forthnumber = (int) (number * 10000) % 10;
        
//Prints out the output data
    System.out.print("The four digits are " +Firstnumber+Secondnumber+Thirdnumber+Forthnumber );
        


} 
//end of main method
}    
//end of class