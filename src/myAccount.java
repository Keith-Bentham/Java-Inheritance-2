class myAccount extends Account {

	private int max;

	public myAccount(int n, int b, int m) {
		super(n, b);
		max = m;

	}

	public boolean deposit(int amt) {
		if ((amt + balance) > max)
			return false;
		else {
			balance += amt;
			return true;
		}
	}
}