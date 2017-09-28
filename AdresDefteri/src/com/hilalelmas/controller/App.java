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
		adres.setIlce("Yuvacýk");
		adres.setIl("Kocaeli");
		adres.setMahalle("çiçek mah.");
		adres.setSokak("korkmaz sokak");
		dao.insert(adres);

		Telefon telefon = new Telefon();
		telefon.setTelno("0555 623 74 15");
		Telefon telefon2 = new Telefon();
		telefon2.setTelno("0262 312 12 00");
		dao.insert(telefon);
		dao.insert(telefon2);
		
		List<Telefon> telefons = new ArrayList<>();
		telefons.add(telefon);
		telefons.add(telefon2);

		Kisi kisi = new Kisi();
		kisi.setEposta("mustafa26@gmail.com");
		kisi.setName("Mustafa");
		kisi.setSurname("Korkmaz");
		kisi.setTelefonList(telefons);
		kisi.setAdres(adres);
		dao.insert(kisi);
		//dao.update(kisi);
		

	}

}
