package model;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Feb 23, 2022
 */
//vehicle commit test
public class Vehicle {

	//truck, coupe, sports, sedan, suv, compact etc
	//could be implemented via a menu so user doesn't choose an unnecessary type of car
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Vehicle() {
		super();
	}
	
	public Vehicle(String type) {
		this.type = type;
	}
	
}
