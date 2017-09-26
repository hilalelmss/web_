package com.hilalelmas.dao;

import com.hilalelmas.entity.Kisi;

public class DAO extends ADao {

	public void insert(Object object) {
		em.getTransaction().begin();
		em.persist(object);
		em.getTransaction().commit();

	}

	public void delete(Object object) {
		em.getTransaction().begin();
		em.remove(object);
		em.getTransaction().commit();
	}

	public void update(int id) {
		em.getTransaction().begin();
		em.merge(id);
		em.getTransaction().commit();
	}

	// public Kisi getKisiId(int id) {
	// return em.find(Kisi.class, 1);
	// }

}
