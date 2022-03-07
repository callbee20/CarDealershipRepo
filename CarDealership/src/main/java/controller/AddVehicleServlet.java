package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.VehicleModel;

/**
 * Servlet implementation class AddVehicleServlet
 */
@WebServlet("/addVehicleServlet")
public class AddVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVehicleServlet() {
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
		String make = request.getParameter("make");
		String model = request.getParameter("model");
		String driveTrain = request.getParameter("driveTrain");
		String price = request.getParameter("price");
		String dateAdded = request.getParameter("dateAdded");
		
		VehicleModelHelper vmh = new VehicleModelHelper();
		//always pass the date thru the vmh converter
		VehicleModel vm = new VehicleModel(make, model, driveTrain, price, vmh.stringToDate(dateAdded));
		vmh.addModel(vm);
		
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
