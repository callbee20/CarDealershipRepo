import java.util.List;

import controller.CarDealershipHelper;
import model.CarDealership;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Mar 7, 2022
 */
public class DealershipTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarDealership bobby = new CarDealership("Bobby's Cars", "Ankeny", "2009/08/21");
		CarDealershipHelper cdh = new CarDealershipHelper();
		cdh.addLot(bobby);
		
		List<CarDealership> allLots = cdh.showAllLots();
		for(CarDealership a: allLots) {
			System.out.println(a.toString());
		}
		
	}

}
