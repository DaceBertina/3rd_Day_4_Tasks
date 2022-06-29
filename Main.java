package banking;

public class Main {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(5000.00);
		BankAccount acc2 = new BankAccount(6000.00);
		BankAccount acc3 = new BankAccount(7000.00);
		BankAccount acc4 = new BankAccount(8000.00);
		BankAccount acc5 = new BankAccount(9000.00);
		
		BankAccount.printBalance();
		System.out.println();
		
		acc1.deposit(6000.00);
		
		acc2.withdraw(7000.00);
		
		acc3.transferMoney(acc4, 8000.00);
		
		System.out.println("\nFinally the status of your accounts is as follows:");
		int j = 1;
		for (int i = 0; i < BankAccount.allAccounts.size(); i++) {
			System.out.println("Acc" + j + ": " + BankAccount.allAccounts.get(i) + ";");
			j++;
		}
	}

}
