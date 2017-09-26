
package com.hilalelmas.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.hilalelmas.dao.DAO;
import com.hilalelmas.entity.Kisi;

@ManagedBean(name = "kisiAdd")
@SessionScoped
public class KisiController {
	Kisi kisiler;
	public List<Kisi> listkisi;

	@PostConstruct
	public void init() {
		kisiler = new Kisi();
		DAO dao = new DAO();
		listkisi = dao.getKisiList();
		//listkisi.add(kisiler);
	}

	public void setKisiler(Kisi kisiler) {
		this.kisiler = kisiler;
	}
	public Kisi getKisiler() {
		return kisiler;
	}

	public void setListkisi(List<Kisi> listkisi) {
		this.listkisi = listkisi;
	}

	public List<Kisi> getListkisi() {
		return listkisi;
	}

}