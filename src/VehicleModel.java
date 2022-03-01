
/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Feb 28, 2022
 */
public class VehicleModel extends Vehicle{

	private String brand;
	private String model;
	private int mileage;
	private boolean newCondition;
	private boolean warrentyStatus;
	private int doorNumber;
	
	public VehicleModel(String brand, String model, int mileage, boolean newCondition, boolean warrentyStatus, int doorNumber) {
		this.brand = brand;
		this.model = model;
		this.mileage = mileage;
		this.newCondition = newCondition;
		this.warrentyStatus = warrentyStatus;
		this.doorNumber = doorNumber;
	}
	
	public VehicleModel(String brand, String model, int mileage, int doorNumber) {
		this.brand = brand;
		this.model = model;
		this.mileage = mileage;
		this.doorNumber = doorNumber;
	}
	
	public VehicleModel(String brand, String model, int mileage) {
		this.brand = brand;
		this.model = model;
		this.mileage = mileage;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/**
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	/**
	 * @return the newCondition
	 */
	public boolean isNewCondition() {
		return newCondition;
	}

	/**
	 * @param newCondition the newCondition to set
	 */
	public void setNewCondition(boolean newCondition) {
		this.newCondition = newCondition;
	}

	/**
	 * @return the warrentyStatus
	 */
	public boolean isWarrentyStatus() {
		return warrentyStatus;
	}

	/**
	 * @param warrentyStatus the warrentyStatus to set
	 */
	public void setWarrentyStatus(boolean warrentyStatus) {
		this.warrentyStatus = warrentyStatus;
	}

	/**
	 * @return the doorNumber
	 */
	public int getDoorNumber() {
		return doorNumber;
	}

	/**
	 * @param doorNumber the doorNumber to set
	 */
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	@Override
	public String toString() {
		return "VehicleModel [brand=" + brand + ", model=" + model + ", mileage=" + mileage + ", newCondition="
				+ newCondition + ", warrentyStatus=" + warrentyStatus + ", doorNumber=" + doorNumber + "]";
	}

	
	
	
	
}
