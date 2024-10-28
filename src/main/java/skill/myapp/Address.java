package skill.myapp;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String street;
	private String city;
	private String state;

	public Address() {
		super();
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}

}
