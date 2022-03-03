/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Mar 2, 2022
 */
package controller;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.VehicleModel;

public class VehicleModelHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CarDealership");

	public VehicleModelHelper() {
		
	}
	//TODO other functions like delete/edit
	public void addModel(VehicleModel vm) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(vm);
		em.getTransaction().commit();
		em.close();
	}
}
