package banking;

	
	abstract public class Account {
		   protected int balance;
		   protected int deposit;
		   protected int withdraw;
		   protected int previousTransaction;
		   
		   
		   //balance method
		   void balance(int amount) {
			   balance = amount;
			   previousTransaction = amount;
		   }
		   
		   //deposit method
		   void deposit(int amount) {
				   balance += amount;
				   previousTransaction = amount;
			   
		   }
		   
		   //withdraw method
		   void withdraw(int amount) {
			   if(balance != 0 && !(amount > balance)) {
				   balance -= amount;
				   previousTransaction = -amount;
			   } else {
				System.err.println("Insufficient Funds");
			}
		   }
		   
		 //get the previous transaction method
		 	void getPreviousTransaction() {
		 		if(previousTransaction > 0) {
		 			System.out.println("Deposited " + previousTransaction);
		 		}
		 		else if(previousTransaction < 0) {
		 			System.out.println("Withdrawal " + Math.abs(previousTransaction)); //Math.abs converts it to absolute
		 		}
		 		else
		 		{System.out.println("no transaction made");}
		 	}
		   
		   
		}



