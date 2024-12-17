
public abstract  class Account {
	
	String name;
	int moNo;
	int accNo;
	int balance;
	public Account(String name, int moNo, int accNo, int balance) {
		super();
		this.name = name;
		this.moNo = moNo;
		this.accNo = accNo;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoNo() {
		return moNo;
	}
	public void setMoNo(int moNo) {
		this.moNo = moNo;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public void deposit(int amount) {
		 this.setBalance(amount);
		 System.out.println("Total Amount : "+this.getBalance());
	}
	
	public  abstract void withdraw( int ramt );
	
	
	

}
