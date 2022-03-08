import java.util.ArrayList;
import java.util.List;

import controller.CarDealershipHelper;
import controller.DealershipCatalogHelper;
import model.CarDealership;
import model.DealershipCatalog;
import model.VehicleModel;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Mar 7, 2022
 */
public class CatalogTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarDealership macks = new CarDealership("Mack's Dealers", "Carlisle", "2015/04/11");
		CarDealershipHelper cdh = new CarDealershipHelper();
		
		VehicleModel prius = new VehicleModel("Prius", "Toyota", "fwd", "6000", "2009/09/28");
		VehicleModel sedan = new VehicleModel("Sedan", "Nissan", "fwd", "8500", "2011/10/13");
		
		List<VehicleModel> mackVehicles = new ArrayList<VehicleModel>();
		mackVehicles.add(sedan);
		mackVehicles.add(prius);
		
		DealershipCatalog macksCatalog = new DealershipCatalog("Mack's Dealers Catalog", macks);
		macksCatalog.setListOfModels(mackVehicles);
		DealershipCatalogHelper ch = new DealershipCatalogHelper();
		
		List<DealershipCatalog> allCatalogs = ch.getCatalogs();
		for(DealershipCatalog a: allCatalogs) {
			System.out.println(a.toString());
		}
		
	}

}
