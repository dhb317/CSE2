////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Dhruv Bajoria
//CSE-002
//09/12/2014
//Homework 03
//Root Java Program
//The program computes crude estimates of the cube roots and the values of these crude guesses when cubed

// first compile the program
//      javac Root.java
// run the program
//      java Root

//Required for imports
import java.util.Scanner;

//define a class
public class Root {
//add main method 
    public static void main(String[] args) {
    
    Scanner myScanner;
    myScanner = new Scanner(System.in);
        
//Allows the users to input the number
    System.out.print ("Enter a double, and I print its cube root- ");
    double number = myScanner.nextDouble();
        
//The chnace for the first guess 
    double guess1=number/3;
        
//The chance for the second guess
    double guess2=(guess1*guess1*guess1+number)/(3*guess1*guess1);
        
//The chance for the third guess
    double guess3=(guess2*guess2*guess2+number)/(3*guess2*guess2);
        
//The chance for the fourth guess
    double guess4=(guess3*guess3*guess3+number)/(3*guess3*guess3);
        
//The chnace for the fifth guess
    double guess5=(2*guess4*guess4*guess4+number)/(3*guess4*guess4);
        
//Calculates the value of the crude guess when cubed
    double value=guess5*guess5*guess5;        
        
//Prints out the output data
    System.out.println ("The cube root is "+guess5+":");
    System.out.println (guess5+"*"+guess5+"*"+guess5+"="+value);

}   
//end of main methid

}   
//end of class