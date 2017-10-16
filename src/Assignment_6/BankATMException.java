/**
 * 
 */
package Assignment_6;                                                   // package declared
@SuppressWarnings("serial")												// custom exception declared  		
public class BankATMException extends RuntimeException {				// BankATMException Run time Exception declared
	private String message;												// string variable declared
	public BankATMException(String message) {							// constructor declared
        this.message = message;}										// this keyword is used to distinguish between class and instance variables
	public BankATMException(Throwable cause, String message) {			// Exception declared
        super(cause);													// Super keyword is used to distinguish between class and instance variables
        this.message = message;}										// this keyword is used to distinguish between class and instance variables
	public String getMessage() {										// getter declared
        return message;}
}																		// class closed
