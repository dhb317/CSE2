///////////////////////////////////////////////////////////////////////////////////////
//Dhruv Bajoria
//CSE-002
//09/22/2014
//Homework 4
//Month Java Program
//This program displays the number of days in a particular month

//first compile the program
//      javac Month.java
//run the program
//      java Month

//required for imports
import java.util.Scanner;
	
//define a class
public class Month {
	
//add main method 
public static void main(String[] args) {

Scanner myScanner;
myScanner = new Scanner(System.in);
	
//asking the user to enter the month
System.out.print ("Enter an int giving the number of the month (1-12)- ");
	
//starting of if statement
if (myScanner.hasNextInt()) {
int A= myScanner.nextInt();
	
//starting of if statement
if (A>=1&&A<=12) {
	
//starting of if statement
if (A==1||A==3||A==5||A==7||A==8||A==10||A==12) {
System.out.println ("The Month has 31 days");
} 
//ending of if statement
	
// starting of else and if statement
else if (A==4||A==6||A==9||A==11) {
System.out.println ("The Month has 30 days");
} 
//ending of else and if statement
	
//starting of else statement
else {
System.out.print ("Enter an int giving the year ");
	
//starting of if statement
if (myScanner.hasNextInt()) {
int B=myScanner.nextInt();
	
//starting of if statement
if (B>0) {
	
//starting of if statement
if (B%4==0 && B%400==0) {
System.out.println ("The Month has 29 days");
} 
//ending of if statement

//starting of else statement
else {
System.out.println ("The Month has 28 days");
} 
//ending of else statement

} 
//ending of if statement
//starting of else statement	
else {
System.out.println ("You did not enter a positive int");
return;
} 
// ending of else statement
	
} 
//ending of if statement
//starting of else statement	
else {
System.out.println ("You did not enter an int");
return;
} 
//ending of else statement
	
} 
//ending of else statement
	
} 
//ending of if statement
//starting of else statement
else {
System.out.println ("You did not enter an int between 1 and 12");
return;
}
//ending of else statement
	
} 
// ending of if statement
//starting of else statement
else {
System.out.println ("You did not enter an int");
return;
} 
//ending of else statement
	
} 
// end of main method
} 
// end of class