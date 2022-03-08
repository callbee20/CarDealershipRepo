package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarDealership;
import model.DealershipCatalog;
import model.VehicleModel;

/**
 * Servlet implementation class CreateNewCatalogServlet
 */
@WebServlet("/createNewCatalogServlet")
public class CreateNewCatalogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateNewCatalogServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		VehicleModelHelper vmh = new VehicleModelHelper();
		String catalogName = request.getParameter("dealershipCatalogName");
		System.out.println("Catalog Name: " + catalogName);
		String dealershipName = request.getParameter("cardealership");
		//String[] selectedVehicles = request.getParameterValues("allVehiclesToAdd");
		List<String> selectedVehicles = Arrays.asList(request.getParameterValues("allVehiclesToAdd"));
		
		List<VehicleModel> selectedVehiclesInList = new ArrayList<VehicleModel>();
		
		int size = selectedVehicles.size();
		if(selectedVehicles != null && size > 0) {
			for(int i = 0; i<size; i++) {
				System.out.println(selectedVehicles.get(i));
				VehicleModel v = vmh.searchForVehicleById(Integer.parseInt(selectedVehicles.get(i)));
				selectedVehiclesInList.add(v);
			}
		}
		
		CarDealership dealership = new CarDealership(dealershipName);
		DealershipCatalog dc = new DealershipCatalog(catalogName, dealership);
		dc.setListOfModels(selectedVehiclesInList);
		DealershipCatalogHelper dch = new DealershipCatalogHelper();
		dch.insertNewDealershipCatalog(dc);
		
		System.out.println("Success!");
		System.out.println(dc.toString());
		
		getServletContext().getRequestDispatcher("/viewAllCatalogsServlet").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
