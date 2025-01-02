package com.kabira.treeset;

public class Account  implements Comparable<Account>{

	int accNumber;
	String accHolderName;

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
		if (this.accNumber == otherObj.accNumber) {
			return true;
		}
		return false;

	}

	@Override
	public int compareTo(Account o) {
		if( this.getAccNumber() > o.accNumber)
		{
			return 1 ;
		}
		else if( this.getAccNumber() < o.accNumber)
		{
			return -1 ;

		}
		else 
		{
			return 0;
		}
		
		

	
	}
}
