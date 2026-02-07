package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		//Account acc = new Account(1001, "Daryl", 200.00);
		//acc.withdraw(100.0);
		SavingsAccount acc2 = new SavingsAccount(1002, "Michonne", 200.00, 0.01);
		acc2.withdraw(100.0);
		BusinessAccount acc3 = new BusinessAccount(1003, "Glenn", 200.00, 100.0);
		acc3.withdraw(100.0);
		//System.out.println(acc.getBalance());
		System.out.println(acc2.getBalance());
		System.out.println(acc3.getBalance());
	}

}
