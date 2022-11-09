package ExceptionHandling;

public class BankAccTest {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(10000);
		
		try {
			account.withdraw(3000);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}
}
