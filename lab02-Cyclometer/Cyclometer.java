//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Dhruv Bajoria
// CSE-002 Lab 2
// 09/05/2014
// Cyclometer Java Program
// The program prints counts and records the distance covered in the bicycle Cyclometer
//




//   define the class
public class Cyclometer {
//   main method required for every java program
   public static void main (String[] args) {

     int secsTrip1=480; //Number of seconds required to complete the first trip
     int secsTrip2=3220;  //Number of seconds required to complete the second trip
     int countsTrip1=1561; //Number of counts for trip 1
     int countsTrip2=9037; //Number of counts for trip 2

     double wheelDiameter=27.0, // The diameter of the wheeel
     PI=3.14159, //The numerical value of PI
     feetPerMile=5280, //Number of feets in a mile used to calculate in the program
     inchesPerFoot=12, //number of inches in a foot used to calcuate in the program
     secondsPerMinute=60, //Number of seconds in a minute used to caulucate the time in the program
     double distanceTrip1, distanceTrip2,totaldistance; // measurement of total distance

     System.out.println("Trip 1 took"+(secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");  
     System.out.println("Trip 2 took"+(secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");

// run the calculations; store the values

     distanceTrip1=countsTrip1*wheelDiameter*PI;
// The above gives distance in inches
// For each count the rotation, a rotation of the wheel travels diameter in inches times PI
     distanceTrip1/=inchesPerFoot*feetPerMile;
// Gives distance in miles
     distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
     
// Print out the output data
     System.out.println("Trip 1 was "+distanceTrip1+" miles");
     System.out.println("Trip 2 was "+distanceTrip2+" miles");
     System.out.println("The total distance was "+totaldistance+" miles");
     
   } //end of main method
} // end of class














