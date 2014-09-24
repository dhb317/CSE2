//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Dhruv Bajoria
//CSE-002
//Lab 03
//09/19/2014
//BigMacAgain Java Program
//The program computes the cost of buying some Big Macs

//  first compile the program
//      javac BigMacAgain.java
//  run the program
//      java BigMacAgain

//required for imports
import java.util.scanner;

//  define a class
public class BigMacAgain {
// add main method 
     public static void main(String[] args) {
//declaring an instance of the scanner object
    Scanner myScanner;
//Calling the scanner constructor
    myScanner = new Scanner(System.in);
Scanner myScanner; //Declaring an instance of the Scanner object
myScanner= new scanner( System.in ); //Calling the scanner constructor 

//Prompting the user to input the number of big macs
System.out.print("Enter the number of Big Macs(an interger > 0) : ");
//Accepting user input
int nBigMacs = myScanner.nextint ();



//Cost of Big Mac
System.out.print("Enter the cost per Big Mac as"+" a double (in the form of xx.xx) :";

//Unit Price of the Big Mac
double bigMac$=myScanner.nextDouble();



//Percent Sales TAx on Big Macs
System.out.print("Enter the percent tax as a whole number (xx) :");

//Taxes per Big Mac
double TaxRate= myScanner.nextDouble ();

taxRate/=100; //user enters percent but i want proportion

    
    