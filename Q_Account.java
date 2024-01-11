package javaTask_C_day_10;

public class Q_Account {
	
	// 4.Create a class Account class with balance as data member. 
	// Create two constructors (no argument, and two arguments) and methods to withdraw and deposit balance.

	  private double balance;

	  public Q_Account() {
	    this.balance = 0;
	    }
	  
	  public Q_Account(double initialbalance) {
	    this.balance = initialbalance;
	    }
	    
	  public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Withdrawal successful Remaining balance: " + balance);
	        } else {
	           System.out.println("Withdrawal failed Insufficient funds or invalid amount.");
	        }
	    }

	  
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance = balance+amount;
	            System.out.println("Deposit successful New balance: " + balance);
	        } else {
	            System.out.println("Deposit failed Invalid amount.");
	        }
	    }
	    public static void main(String[] args) {
	    
	        Q_Account account1 = new Q_Account(); 
	        Q_Account account2 = new Q_Account(1000.0);     
	       
	      	account1.withdraw(500);
	      	
	        account2.deposit(500);

	       
	        System.out.println("Final balance of account1: " + account1.balance);
	        System.out.println("Final balance of account2: " + account2.balance);
	    }
	}


