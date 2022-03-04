/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Mar 2, 2022
 */
package controller;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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
	
	public List<VehicleModel> showAllVehicles() {
		EntityManager em = emfactory.createEntityManager();
		List<VehicleModel> allVehicles = em.createQuery("SELECT i FROM VehicleModel i").getResultList();
		return allVehicles;
	}
	
	public void deleteVehicle(VehicleModel toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<VehicleModel> typedQuery = em.createQuery("select vm from VehicleModel vm where vm.model =:selectedModel and vm.make =:selectedMake and vm.driveTrain =:selectedDriveTrain and vm.price =:selectedPrice and vm.addedToLot =:selectedAddedToLot", VehicleModel.class);
		typedQuery.setParameter("selectedModel", toDelete.getModel());
		typedQuery.setParameter("selectedMake", toDelete.getMake());
		typedQuery.setParameter("selectedDriveTrain", toDelete.getDriveTrain());
		typedQuery.setParameter("selectedPrice", toDelete.getPrice());
		typedQuery.setParameter("selectedAddedToLot", toDelete.getAddedToLot());
		
		typedQuery.setMaxResults(1);
		VehicleModel result = typedQuery.getSingleResult();
		
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
}
