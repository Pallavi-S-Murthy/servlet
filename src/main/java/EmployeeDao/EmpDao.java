package EmployeeDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import EmployeeDto.EmpDto;

public class EmpDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void create(EmpDto d1) {
		
		entityTransaction.begin();
		entityManager.persist(d1);
		entityTransaction.commit();
	}
	
	public EmpDto login(String email) {
		EmpDto dto= entityManager.find(EmpDto.class, email);
		return dto;
	}
	
}
