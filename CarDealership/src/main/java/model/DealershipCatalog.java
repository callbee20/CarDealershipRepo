package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Mar 7, 2022
 */
@Entity
public class DealershipCatalog {

	@Id
	@GeneratedValue
	private int id;
	private String dealershipCatalogName;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private CarDealership dealership;
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	private List<VehicleModel> listOfModels;
	
	public DealershipCatalog() {
		
	}
	
	public DealershipCatalog(int id, String dealershipCatalogName, CarDealership dealership, List<VehicleModel> listOfModels) {
		this.id = id;
		this.dealershipCatalogName = dealershipCatalogName;
		this.dealership = dealership;
		this.listOfModels = listOfModels;
	}
	
	public DealershipCatalog(String dealershipCatalogName, CarDealership dealership, List<VehicleModel> listOfModels) {
		this.dealershipCatalogName = dealershipCatalogName;
		this.dealership = dealership;
		this.listOfModels = listOfModels;
	}
	
	public DealershipCatalog(String dealershipCatalogName, CarDealership dealership) {
		this.dealershipCatalogName = dealershipCatalogName;
		this.dealership = dealership;
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the dealershipName
	 */
	public String getDealershipCatalogName() {
		return dealershipCatalogName;
	}
	/**
	 * @param dealershipName the dealershipName to set
	 */
	public void setDealershipName(String dealershipCatalogName) {
		this.dealershipCatalogName = dealershipCatalogName;
	}
	/**
	 * @return the dealership
	 */
	public CarDealership getDealership() {
		return dealership;
	}
	/**
	 * @param dealership the dealership to set
	 */
	public void setDealership(CarDealership dealership) {
		this.dealership = dealership;
	}
	/**
	 * @return the listOfModels
	 */
	public List<VehicleModel> getListOfModels() {
		return listOfModels;
	}
	/**
	 * @param listOfModels the listOfModels to set
	 */
	public void setListOfModels(List<VehicleModel> listOfModels) {
		this.listOfModels = listOfModels;
	}
	@Override
	public String toString() {
		return "DealershipCatalog [id=" + id + ", dealershipCatalogName=" + dealershipCatalogName + ", dealership=" + dealership
				+ ", listOfModels=" + listOfModels + "]";
	}
	
	
	
}
