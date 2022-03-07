package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.VehicleModel;

/**
 * Servlet implementation class EditVehicleServlet
 */
@WebServlet("/editVehicleServlet")
public class EditVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditVehicleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		VehicleModelHelper vmh = new VehicleModelHelper();
		String model = request.getParameter("model");
		String make = request.getParameter("make");
		String driveTrain = request.getParameter("driveTrain");
		String price = request.getParameter("price");
		String dateAdded = request.getParameter("dateAdded");
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		
		VehicleModel vehicleToUpdate = vmh.searchForVehicleById(tempId);
		vehicleToUpdate.setModel(model);
		vehicleToUpdate.setMake(make);
		vehicleToUpdate.setDriveTrain(driveTrain);
		vehicleToUpdate.setPrice(price);
		vehicleToUpdate.setAddedToLot(vmh.stringToDate(dateAdded));
		
		vmh.updateVehicle(vehicleToUpdate);
		
		getServletContext().getRequestDispatcher("/viewAllVehiclesServlet").forward(request, response);
	}

}
