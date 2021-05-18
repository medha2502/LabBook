package inheritence;

import java.util.Scanner;

public class Person {

	private String name;
	private String address;
	Scanner sc = new Scanner(System.in);

	public String getName() {
		
		return name;
	}
	public String getAddress() {
		
		return address;
	}
 
	
public void setName(String name) {
	
		this.name = name;
	}
	public void setAddress(String address) {
	
		this.address = address;
	}

	public String toString() {
		return name + "(" + address +")";
	}
}