/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Mar 2, 2022
 */
import model.VehicleModel;
import controller.VehicleModelHelper;

import java.time.LocalDate;



public class FillDB {
	//test values
	//database cardealership
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleModel vm = new VehicleModel("ford", "fusion", "rwd", "15000", "10/24/2016");
		VehicleModelHelper vmh = new VehicleModelHelper();
		
		vmh.addModel(vm);
	}
}
