public class testAccount {
	public static void main(String[] args) {
		myAccount ma = new myAccount(12205, 200, 300);

		int choice = 5;

		while (choice != 4) {
			System.out.println("\nAccunt Application");
			System.out.println("===================");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");

			choice = Console.readInt("Please enter a value-->");

			if (choice == 1) {
				int amt = Console.readInt("Enter Amount");
				boolean res1 = ma.withdraw(amt);
				if (res1 == false)
					System.out.println("Error");
			}
			
				if (choice == 2) {
					int amt = Console.readInt("Enter Amount");
					boolean res1 = ma.deposit(amt);
					if (res1 == false)
						System.out.println("Error the maximum you can deposit is €300");
				}
				
			 else if (choice == 3) {
				int res = ma.read_balance();
				System.out.println("Balance=" + res);
			}
		}
	}
}
