class AccBalance {
	public static void main(String[] args) {
		double acc_balance = 11999;
		double withdraw = 2000;
		while (acc_balance >= 2000) {
			System.out.println("Withdraw amount is: " + withdraw);
			acc_balance = acc_balance - withdraw;
			System.out.println("Account Balance is: " + acc_balance);
		}
	}
}

/*
 * Withdraw amount is: 2000.0
 * Account Balance is: 9999.0
 * Withdraw amount is: 2000.0
 * Account Balance is: 7999.0
 * Withdraw amount is: 2000.0
 * Account Balance is: 5999.0
 * Withdraw amount is: 2000.0
 * Account Balance is: 3999.0
 * Withdraw amount is: 2000.0
 * Account Balance is: 1999.0
 */