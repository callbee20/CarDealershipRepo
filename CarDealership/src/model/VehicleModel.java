/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Feb 28, 2022
 */
package model;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;

public class VehicleModel {
	//will be an entity
	//autogenerated id
	private int id;
	//specific name ex: ford (fusion)
	private String model;
	//specific brand ex: (ford) fusion
	private String make;
	//all wheel 4wd etc
	private String driveTrain;
	//base sticker price of vehicle
	private double price;
	//not sure if should inherit/extend the Vehicle class or just take it as param like this
	private Vehicle category;
	
	private DateTime addedToLot;

	//TODO implement a way to hold the date/time of this added to warehouse? as a way for the time conversion requirement
	public VehicleModel() {

	}
	public VehicleModel(Vehicle category, String model, String make, String driveTrain, double price, DateTime addedToLot) {
		this.category = category;
		this.model = model;
		this.make = make;
		this.driveTrain = driveTrain;
		this.price = price;
		this.addedToLot = addedToLot;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getDriveTrain() {
		return driveTrain;
	}
	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Vehicle getCategory() {
		return category;
	}
	public void setCategory(Vehicle category) {
		this.category = category;
	}
	public DateTime getAddedToLot() {
		return addedToLot;
	}
	public void setAddedToLot(DateTime addedToLot) {
		this.addedToLot = addedToLot;
	}



}
