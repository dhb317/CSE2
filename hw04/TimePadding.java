///////////////////////////////////////////////////////////////////////////////////////
//Dhruv Bajoria
//CSE-002
//09/23/2014
//Homework 4
//Time Padding Program
//The program helps the user convert the seconds into hours

//first compile the program
//   javac TimePadding.java
//run the program
//      java TimePadding

//required for imports
import java.util.Scanner;
	
//define a class
public class TimePadding {
	
//add main method 
public static void main(String[] args) {

Scanner myScanner;
myScanner = new Scanner(System.in);
	
//asking the user to input time in seconds
System.out.print ("Enter the time in seconds:");

int A=myScanner.nextInt();
//converting seconds to hours
int B=(int)(A/3600);
//converting seconds to minutes
int C=(int)((A-B*3600)/60);
//remainder of seconds
int D=(int)(A-B*3600-C*60);
	
//starting of if statement
if (C<=9){
	
//starting of if statement
if (D<=9){
System.out.println ("The Time is"+B+":0"+C+":0"+D);
} 
//ending of if statement
//starting of else statement
else{
System.out.println("The Time is"+B+":0"+C+D);
}
//ending of else statement
} 
//ending of if statement
	
//starting of else statement
else{
System.out.println ("The Time is"+B+C+D);
} 
//ending the else statement 
	
	
} 
// end of main method
}
// end of class

