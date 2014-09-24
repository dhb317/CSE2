///////////////////////////////////////////////////////////////////////////////////////
//Dhruv Bajoria
//CSE-002
//09/20/2014
//Homework 4
//Income Tax Java Program
//This program calculates the amount of tax on income

//first compile the program
//      javac IncomeTax.java
//run the program
//      java IncomeTax

//required for imports
import java.util.Scanner;
	
//define a class
public class IncomeTax {
	
//add main method
public static void main(String[] args) {

Scanner myScanner;
myScanner=new Scanner(System.in);
	
//asking the user to input his income
System.out.print("Enter an int giving the number of thousands- ");
	
//starting of if statement
if(myScanner.hasNextInt()) {
int A=myScanner.nextInt();
	
//starting of if statement
if (A>0) {
	
//starting of if statement
if (A<20) {
//the tax rate for income less than 20
double B=50;
System.out.println("The tax rate on $"+A*1000+"is 5.0%,and the tax is $"+A*B);
} 
//ending of if statement
	
//starting of else and if statement
else if (A>=20&&A<40) {
//the income tax rate is less than 40 and bigger than 20
double B=70;
System.out.println("The tax rate on $"+A*1000+"is 7.0%, and the tax is $"+A*B);
	    
}
//ending of if and else statement
	
//starting of if and else statement
else if (A>= 40&&A<78) {
//the income tax rate is less than 78 and bigger than 40    
double B=120;
System.out.println ("The tax rate on $"+A*1000+"is 12.0%, and the tax is $"+A*B);
} 
//ending of if and else statement 
	
//starting of else and if statement
else {
double B=140;
System.out.println ("The tax rate on $"+A*1000+"is 14.0%, and the tax is $"+A*B);
} 
//ending of if and else statement	
} 
//ending of if statement
	
//starting of else statement
else {
System.out.println ("You did not enter a positive int");
return;
}
//ending of else statement
	
}
//ending of if statement
	
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