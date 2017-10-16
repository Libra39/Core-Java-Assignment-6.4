/**
 * 
 */
package Assignment_6;																					// Packaged declared
public class BankAtm {																					// class declared
	int atmId;																							// integer variable declared
	String bankName;																					// string variable declared
	String location;																					// string variable declared
	double balance;																						// double variable declared
	
	public BankAtm(int atmId, String bankName, String location, int balance) {							// constructor declared
		this.atmId = atmId;																				// this keyword is used to distinguish between class and instance variables
		this.bankName = bankName;																		// this keyword is used to distinguish between class and instance variables
		this.location = location;																		// this keyword is used to distinguish between class and instance variables
		this.balance = balance;																			// this keyword is used to distinguish between class and instance variables	
		System.out.println("=========================================" );								// Print Statement	
		System.out.println("ATM ID                     : " +this.atmId );								// Print Statement
		System.out.println("Bank Name                  : " +this.bankName );							// Print Statement
		System.out.println("Location                   : " +this.location );							// Print Statement
		System.out.println("Balance                    : " +this.balance );								// Print Statement
		System.out.println("=========================================" );}								// Print Statement
	
	public void withdraw(double amount)throws BankATMException{											// Method declared with custom exception 
		System.out.println("Amount Withdraw            : " +amount );									// Print Statement
		if(amount>balance){																				// if loop 
			throw new BankATMException("Balance is less than 10000. You Cannot withdraw Money");}		// Print statement
		else{																							// else statement
			balance=balance-amount;
			System.out.println("New Balance After Withdraw : "+balance);}								// Print statement			
	}																									// method closed
	public void deposit(double amount)throws BankATMException {											// Method declared with custom exception
		System.out.println("Amount Deposit             : " +amount );									// print Statement
		if(amount<=0.0){																				// if loop
			throw new BankATMException("Cannot deposit Money");											// Print statement
	}else{																								// else statement 
		balance =balance+amount;																		 
		System.out.println("New Balance After Deposit  : "+balance+"\n");								// Print statement		
		System.out.println("---------End of the Statement-----------\n");}								// Print Statement	
	}																									// method closed
}																										// class closed

