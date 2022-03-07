package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import controller.LocalDateAttributeConverter;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Feb 23, 2022
 */
@Entity
@Table(name="Dealerships")
public class CarDealership {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int lotId;
	@Column(name="Name")
	private String dealershipName;
	@Column(name="City")
	private String city;
	@Column(name="established")
	@Convert(converter = LocalDateAttributeConverter.class)
	private LocalDate established;
	@Column(name="Vehicles")
	//@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	private List<VehicleModel> vehicleList;
	
	public CarDealership() {
		super();
	}
	
	public CarDealership(int lotId, String dealershipName, String city, LocalDate established) {
		super();
		this.lotId = lotId;
		this.dealershipName = dealershipName;
		this.city = city;
		this.established = established;
	}
	
	public CarDealership(String dealershipName, String city, LocalDate established) {
		super();
		this.dealershipName = dealershipName;
		this.city = city;
		this.established = established;
		//TODO set up converter for this class just like the one in vehiclemodelhelper
	}
	
	/**
	 * @return the lotId
	 */
	public int getLotId() {
		return lotId;
	}
	/**
	 * @param lotId the lotId to set
	 */
	public void setLotId(int lotId) {
		this.lotId = lotId;
	}
	/**
	 * @return the dealershipName
	 */
	public String getDealershipName() {
		return dealershipName;
	}
	/**
	 * @param dealershipName the dealershipName to set
	 */
	public void setDealershipName(String dealershipName) {
		this.dealershipName = dealershipName;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
