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
		adres.setIlce("Çankaya");
		adres.setIl("Ankara");
		adres.setMahalle("huzur mah.");
		adres.setSokak("1123 sokak");
		dao.insert(adres);

		Telefon telefon = new Telefon();
		telefon.setTelno("0312 123 12 12");
		Telefon telefon2 = new Telefon();
		telefon2.setTelno("0312 123 13 13");
		dao.insert(telefon);
		dao.insert(telefon2);

		List<Telefon> telefons = new ArrayList<>();
		telefons.add(telefon);
		telefons.add(telefon2);

		Kisi kisi = new Kisi();
		kisi.setEposta("mustafa@gmail.com");
		kisi.setName("Mustafa");
		kisi.setSurname("Yýlmaz");
		kisi.setTelefonList(telefons);
		kisi.setAdres(adres);
		dao.insert(kisi);

	}

}
