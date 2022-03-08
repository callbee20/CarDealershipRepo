/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Mar 6, 2022
 */
package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.CarDealership;

public class CarDealershipHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CarDealership");

	public CarDealershipHelper() {
		
	}
	//public LocalDate stringToDate(String date) {
		//use this before creating a new VehicleModel
		//accepts mm/dd/yyyy to convert to localdate for use in converter then table
		//LocalDate newDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		//return newDate;
	//}
	
	public void addLot(CarDealership lot) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(lot);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<CarDealership> showAllLots(){
		EntityManager em = emfactory.createEntityManager();
		List<CarDealership> allLots = em.createQuery("SELECT l FROM CarDealership l").getResultList();
		return allLots;
	}
	
	
	
}
