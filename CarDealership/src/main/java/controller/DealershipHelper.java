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

import model.DealershipCatalog;

public class DealershipHelper {
	public DealershipHelper() {
		
	}
	/*
	 * public LocalDate stringToDate(String date) { //use this before creating a new
	 * VehicleModel //accepts mm/dd/yyyy to convert to localdate for use in
	 * converter then table LocalDate newDate = LocalDate.parse(date,
	 * DateTimeFormatter.ofPattern("MM/dd/yyyy")); return newDate; }
	 */
	public List<CarDealership> getCatalogs() {
		EntityManager em = emfactory.createEntityManager();
		List<DealershipCatalog> allCatalogs = em.createQuery("SELECT c FROM DealershipCatalog c").getResultList();
		return allCatalogs;
	}
	
}
