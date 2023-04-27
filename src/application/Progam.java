package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Progam {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1002, "Gillian", 1000.0);
		acc1.withDraw(200.00);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.05);
		acc2.withDraw(200);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Carlos", 1000.0, 200.0);
		acc3.withDraw(200);
		System.out.println(acc3.getBalance());
	}
	
}
