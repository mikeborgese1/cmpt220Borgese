
public class ex9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Account account = new Account(1122, 20000); // JA: Where is your Account class defined?
	        account.setAnnualInterestRate(4.5);

	        System.out.println("Account ID: " + account.getId());
	        System.out.println("Account Balance: " + account.getBalance());

	        System.out.println("Withdrawing $2,500...");
	        account.withdraw(2500);

	        System.out.println("Depositing $3,000...");
	        account.deposit(3000);

	        System.out.println("Displaying updated info.");
	        System.out.println("Account ID: " + account.getId());
	        System.out.println("Account Balance: " + account.getBalance());
	        System.out.println("Monthly interest rate: " + account.getMonthlyInterestRate());
	        System.out.println("Date account was created: " + account.getDateCreated());
	}
}
