//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Dhruv Bajoria
//CSE-002
//Homework 2
//09/09/2014
//Arithmetic Java Program
//The program calculates sales taxes on purchases


// define the class
public class Arithmetic{
    
// add main method
  public static void main(String[] args) {

//Number of pair of socks
int nSocks=3;

//Cost per pair of socks
//('$' is a part of the variable name)
double sockCost$=2.58;

//Number of drinking glasses
int nGlasses=6;

//Cost per glass
double glassCost$=2.29;

//Number of boxes of envelopes 
int nEnvelopes=1;

//Cost per box of envelopes
double envelopeCost$=3.25;
// Sales Tax In PA
double taxPercent=0.06;

//Total cost of items
double totalSocksCost$ = nSocks*sockCost$;
double totalGlassesCost$ = nGlasses*glassCost$;
double totalEnvelopesCost$ = nEnvelopes*envelopeCost$;

//Cost before tax
double totalCostBeforeTax$ = totalEnvelopesCost$ + totalGlassesCost$ + totalSocksCost$;

//Sales tax
double totalSalesTax$ = totalCostBeforeTax$ * taxPercent;

//Cost After Tax
double totalCostAfterTax$ =  totalCostBeforeTax$ + totalSalesTax$;


// Printing the Program
System.out.println(nSocks+" socks are bought at "+sockCost$+"per unit. Total cost of socks is "+totalSocksCost$);
System.out.println(nGlasses+" glasses are bought at "+glassCost$+"per unit. Total cost of glasses is "+totalGlassesCost$);
System.out.println(nEnvelopes+" envelope is bought at "+envelopeCost$+"per unit. Total cost of envelopes is "+totalEnvelopesCost$);
System.out.println("Total sales tax is "+(int)(totalSalesTax$*100)/100.0);
System.out.println("Total cost of purchases before tax is "+(int)(totalCostBeforeTax$*100)/100.0);
System.out.println("Total cost of purchases after tax is "+(int)(totalCostAfterTax$*100)/100.0);
}
}