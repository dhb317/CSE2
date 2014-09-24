///////////////////////////////////////////////////////////////////////////////////////
//Dhruv Bajoria
//CSE-002
//09/22/2014
//Homework 4
//Course Number Java Program
//This program prints out the semester and the year

//first compile the program
//      javac CourseNumber.java
//run the program
//      java CourseNumber

//required for import
import java.util.Scanner;
	
//define a class
public class CourseNumber {
	
//add main method 
public static void main(String[] args) {

Scanner myScanner;
myScanner = new Scanner(System.in);
	
//asking enter the course number
System.out.print ("Enter a six digit number giving the course semester- ");

int A=myScanner.nextInt();
int B=(int)(A/100);
int C=A-B*100;
	
//starting of if statement
if (B>=1865&&B<=2014) {
	
//starting of if statement
if (C==10||C==20||C==30||C==40) {
	
//starting of if statement
if (C==10) {
System.out.println ("The course was offered in the Spring semester of "+B);
} 
//ending of if statement
	
//starting of if and else statement
else if (C==20) {
System.out.println ("The course was offered in Summer 1 semester of "+B);
} 
//ending of if and else statement
	
//starting of if and else statement
else if (C==30) {
System.out.println ("The course was offered in the Summer 2 semester of "+B);
} 
//ending of if and else statement
	
//starting of else statement
else {
System.out.println ("The course was offered in the Fall semester of "+B);
} 
//ending of else statement
	
} 
//ending of if statement
	
//starting of else statement
else {
System.out.println (C+ "is not a legitimate semester");
return;
} 
//ending of else statement
	
} 
//ending of if statement
	
//starting of else statement
else {
System.out.println ("The number was outside the range [186510,201440]");
} 
//ending of else statement
	
} 
// end of main method
} 
// end of class

