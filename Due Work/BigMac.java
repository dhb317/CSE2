///////////////////////////////////////////////////////////////////////////////////////
//Dhruv Bajoria
//CSE-002
//Lab-03 9/12/2014
//BigMac Java Program
//The program uses the scanner class to obtain how many Big Macs
//are comsumed, at what price and the tax percentage

import java.util.Scanner;
// define the class
public class BigMac {
// main method required for every java program
public static void main(String[] args)  {

Scanner myScanner; //Declaring an instance of the Scanner object
myScanner= new scanner( System.in ); //Calling the scanner constructor 

//Number of tickets
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

double cost$; //
int dollars, //whole dollar amount of cost dimes, pennies;
// for sorting digits
//