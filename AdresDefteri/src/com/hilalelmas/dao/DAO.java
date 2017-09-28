package com.hilalelmas.dao;

import java.util.List;

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

	public void update(Object object) {
		em.getTransaction().begin();
		em.merge(object);
		em.getTransaction().commit();
	}

	// public Kisi getKisiId(int id) {
	// return em.find(Kisi.class, 1);
	// }

	public List<Kisi> getKisiList(){
		return this.em.createQuery("SELECT c FROM Kisi c").getResultList();
	}
}
