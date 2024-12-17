package NamsteDuniyaValo;

public class Address {
	
	
	String city ;
	String  Dist;
	int pin;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String dist, int pin) {
		super();
		this.city = city;
		Dist = dist;
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDist() {
		return Dist;
	}

	public void setDist(String dist) {
		Dist = dist;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	

}
