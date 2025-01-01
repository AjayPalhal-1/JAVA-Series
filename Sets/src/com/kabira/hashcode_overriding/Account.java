package com.kabira.hashcode_overriding;

public class Account {
	
	int accNumber;
	String accHolderName ;
	public Account(int accNumber, String accHolderName) {
		super();
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
	}

	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	
	@Override
	public int hashCode() {
		return this.getAccNumber();
	}
	
	@Override
	public boolean equals(Object obj) {
		Account otherObj = (Account) obj;
		if (this.accNumber == otherObj.accNumber) 
		{
			return true;
		}
		return false;

	}

	
	
	
	
	

}
