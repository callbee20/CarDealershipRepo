
/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Feb 23, 2022
 */
public class CarDealershipClass {

	private int lotId;
	private String dealershipName;
	private String city;
	
	
	public CarDealershipClass() {
		super();
	}
	
	public CarDealershipClass(int lotId, String dealershipName, String city) {
		super();
		this.lotId = lotId;
		this.dealershipName = dealershipName;
		this.city = city;
	}
	
	public CarDealershipClass(String dealershipName, String city) {
		super();
		this.dealershipName = dealershipName;
		this.city = city;
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
