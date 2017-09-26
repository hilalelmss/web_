package com.hilalelmas.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class ADao {
	protected EntityManager em;

	public ADao() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AdresDefteri");
		this.em = emf.createEntityManager();
	}
}
