package com.hilalelmas.controller;

import java.util.ArrayList;
import java.util.List;

import com.hilalelmas.dao.DAO;
import com.hilalelmas.entity.Adres;
import com.hilalelmas.entity.Kisi;
import com.hilalelmas.entity.Telefon;

public class App {
	public static void main(String[] args) {
		DAO dao = new DAO();

		Adres adres = new Adres();
		adres.setIlce("Polatlý");
		adres.setIl("Ankara");
		dao.insert(adres);

		Telefon telefon = new Telefon();
		telefon.setTelno("03126222222");
		dao.insert(telefon);

		List<Telefon> telefons = new ArrayList<>();
		telefons.add(telefon);

		Kisi kisi = new Kisi();
		kisi.setEposta("hilal@gmail.com");
		kisi.setName("Hilal");
		kisi.setSurname("Elmas");

		dao.insert(kisi);

	}

}
