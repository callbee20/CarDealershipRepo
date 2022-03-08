package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.DealershipCatalog;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Mar 7, 2022
 */
public class DealershipCatalogHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("CarDealership");
	
	public void insertNewDealershipCatalog(DealershipCatalog d) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(d);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<DealershipCatalog> getCatalogs() {
		EntityManager em = emfactory.createEntityManager();
		List<DealershipCatalog> allCatalogs = em.createQuery("SELECT c FROM DealershipCatalog c").getResultList();
		return allCatalogs;
	}
	
}
