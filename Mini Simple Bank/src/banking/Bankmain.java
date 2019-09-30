package banking;

import java.util.Scanner;
import java.util.Random;

public class Bankmain extends Account {
	protected int userId;   //user's identification number
	protected int userPhoneNumber; //user's phone number
	protected String userName; // user's name
	
	int accountNumber;  
	

	

	
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);  
		
		System.out.println("Enter your name");
		userName = scanner.nextLine();  //captures user's name
		
		System.out.println("Enter your ID ");
		userId = scanner.nextInt();     // captures user's Identification number
		
		System.out.println("Enter your phone number ");
		userId = scanner.nextInt();     // captures user's phone number
		
		/**
		 * GENERATES ACCOUNT NUMBER RANDOMLY
		 */
		
		Random rand =new Random();
		accountNumber = rand.nextInt(999999999);
		
		while( accountNumber <= 100000000) {
			if (accountNumber >= 100000000) {
				
			}else {
				accountNumber = rand.nextInt(999999999);
			}
						
			
		}
		
		System.out.println("\n");
		System.out.println("*********************************************************************");
		
		
		//user's detail display
		System.out.println("Welcome " + userName);
		System.out.println("Your ID " + userId);
		System.out.println("your phone number: "+ userPhoneNumber);
		System.out.println("Your AccountNumber is: " + accountNumber);
		System.out.println("\n");
		
		//display's menu
		System.out.println("A: Check balance");
		System.out.println("B: Deposit");
		System.out.println("C: Withdraw");
		System.out.println("D: Previous Transaction");
		System.out.println("E: Exit");
	
		
		
		do {
			System.out.println("================================================================");
			System.out.println("Enter an option");
			System.out.println("================================================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
			case 'A' :
				System.out.println("------------------------------------------------------------");
				System.out.println("Balance = " + balance);
				System.out.println("------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B' :
				System.out.println("------------------------------------------------------------");
				System.out.println("Enter amount to be deposited: ");
				System.out.println("------------------------------------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C' :
				System.out.println("-----------------------------------------------------------");
				System.out.println("Enter amount to withdraw: ");
				System.out.println("-----------------------------------------------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D' :
			    System.out.println("-----------------------------------------------------------");
			    getPreviousTransaction();  
			    System.out.println("-----------------------------------------------------------");
			    System.out.println("\n");
				break;

			case 'E' :
				System.out.println("***********************************************************");
				System.out.println("___________________________________________________________");
				break;
				
			default:
				System.out.println("invalid option please try again");
				break;
				
			}
		} 
		while(option != 'E');
		
		System.out.println("thank you");

}
}
