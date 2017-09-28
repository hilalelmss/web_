
package com.hilalelmas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.hilalelmas.dao.DAO;
import com.hilalelmas.entity.Adres;
import com.hilalelmas.entity.Item;
import com.hilalelmas.entity.Kisi;
import com.hilalelmas.entity.Telefon;

@ManagedBean(name = "kisiBean")
@ViewScoped
public class KisiController {
	Kisi kisiler;
	public List<Kisi> listkisi;
	List<String> telefonlar = new ArrayList<>();
	List<Item> sayac = new ArrayList<>();

	@PostConstruct
	public void init() {
		kisiler = new Kisi();
		Adres adres = new Adres();
		kisiler.setAdres(adres);
		DAO dao = new DAO();
		listkisi = dao.getKisiList();
		// listkisi.add(kisiler);
		sayac.add(new Item(0));
		telefonlar.add("");
	}
	
	
	public void addTelefon() {
		// TODO Auto-generated method stub
		telefonlar.add("");

		sayac.add(new Item(sayac.size()));
		
	}
	
	public void setTelefonlar(List<String> telefonlar) {
		this.telefonlar = telefonlar;
	}
	public List<String> getTelefonlar() {
		return telefonlar;
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
	

	public void setSayac(List<Item> sayac) {
		this.sayac = sayac;
	}
	
	public List<Item> getSayac() {
		return sayac;
	}
	
	

	public void kaydet() {
		List<Telefon> telefonList = new ArrayList<>();
		for (String string : telefonlar) {
			Telefon telefon = new Telefon();
			telefon.setTelno(string);
			telefonList.add(telefon);

		}
		kisiler.setTelefonList(telefonList);
		DAO dao = new DAO();
		dao.insert(kisiler);
		listkisi = dao.getKisiList();

	}

}