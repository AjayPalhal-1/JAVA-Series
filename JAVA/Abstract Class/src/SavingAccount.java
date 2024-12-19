
public class SavingAccount extends Account{
	
	int minBalance;

	public SavingAccount(String name, int moNo, int accNo, int balance, int minBalance) {
		super(name, moNo, accNo, balance);
		this.minBalance = minBalance;
	}
	
	
	public void withdraw(int ramt )
	{
		this.setBalance(super.balance-ramt);
		System.out.println("Remain Balnace : "+this.getBalance());
	}

	

}
