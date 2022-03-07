package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarDealership;
import model.VehicleModel;

/**
 * Servlet implementation class AddDealerServlet
 */
@WebServlet("/addDealerServlet")
public class AddDealerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDealerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    //TODO create a jsp page for this that gets linked from the index, and change index so it can redirect to either dealership or vehicle options
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String dealershipName = request.getParameter("name");
		String city = request.getParameter("city");
		String established = request.getParameter("date");
		
		CarDealershipHelper carHelp = new CarDealershipHelper();
		//always pass the date thru the vmh converter
		CarDealership lot = new CarDealership(dealershipName, city, carHelp.stringToDate(established));
		carHelp.addLot(lot);
		
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
