package NamsteDuniyaValo;

public class Account {

	int actId;
	String actName;
	String pin;
	Address postal;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int actId, String actName, String pin ,Address v4) {
		super();
		this.actId = actId;
		this.actName = actName;
		this.pin = pin;
		postal = v4;
	}

	public int getActId() {
		return actId;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Address getPostal() {
		return postal;
	}

	public void setPostal(Address postal) {
		this.postal = postal;
	}

	
	public void Display()
	{
		System.out.println("ACC Holder Name :"+this.actName);
		System.out.println("Acc . Id :"+this.actId);
		System.out.println("Acc. Pin : "+this.pin);
		
	}

}
