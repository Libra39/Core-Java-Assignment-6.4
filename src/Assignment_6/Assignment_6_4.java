/**
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
package Assignment_6;														// Package declared 
public class Assignment_6_4 {												// Class Declared 
	public static void main(String[] args) {								// Method Declared			
	BankAtm bank1=new BankAtm(1001, "SBI Bank", "Navi Mumbai", 20000);		// new instance created with inputs
   	try {																	// try block Started
			bank1.withdraw(500);											// object called with value
			bank1.deposit(500);												// object called with value			
		}catch(Exception e) {												// catch statement 
			System.out.println("Exception occurred "+e);}					// Print statement
	
   	BankAtm bank2=new BankAtm(1022, "Citi Bank", "Navi Mumbai", 30000);		// new instance created with input
   	try {																	// try block started
			bank2.withdraw(2500);											// object called with value
			bank2.deposit(500);												// object called with value
		}catch(Exception e) {												// catch statement
			System.out.println("Exception occurred "+e);}					// Print statement

   	BankAtm bank3=new BankAtm(1221, "ICICI Bank", "Navi Mumbai", 10000);	// new instance created with input
   	try {																	// try block
			bank3.withdraw(10100);											// new instance created with input
			bank3.deposit(500);												// new instance created with input
   		}catch(Exception e) {												// catch statement
			System.out.println("Exception occurred "+e);}					// print statement	
	}																		// main method closed
}																			// class Assignment_6_4 closed