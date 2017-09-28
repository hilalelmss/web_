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
		adres.setMahalle("cýkmaz mah.");
		adres.setSokak("necati sokak");
		dao.insert(adres);

		Telefon telefon = new Telefon();
		telefon.setTelno("0544 963 10 45");
		Telefon telefon2 = new Telefon();
		telefon2.setTelno("0312 741 52 63");
		dao.insert(telefon);
		dao.insert(telefon2);
		
		List<Telefon> telefons = new ArrayList<>();
		telefons.add(telefon);
		telefons.add(telefon2);

		Kisi kisi = new Kisi();
		kisi.setEposta("necati@gmail.com");
		kisi.setName("Necati");
		kisi.setSurname("Yýlmaz");
		kisi.setTelefonList(telefons);
		kisi.setAdres(adres);
		dao.insert(kisi);
		//dao.update(kisi);
		
		

	}

}
