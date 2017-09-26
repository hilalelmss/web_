package com.hilalelmas.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Kisi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="kisi_id")
	int idkisi;
	//@Enumerated(EnumType.STRING)
	String name;
//	@Enumerated(EnumType.STRING)
	String surname;
	String eposta;

	public int getIdkisi() {
		return idkisi;
	}

	public void setIdkisi(int idkisi) {
		this.idkisi = idkisi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	@OneToOne
	Adres adres;

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public Adres getAdres() {
		return adres;
	}

	@OneToMany
	@JoinTable(name = "kisi_tel", joinColumns = @JoinColumn(name = "kisi_id"), inverseJoinColumns = @JoinColumn(name = "tel_id"))
	List<Telefon> telefonList = new ArrayList<>();

	public void setTelefonList(List<Telefon> telefonList) {
		this.telefonList = telefonList;
	}

	public List<Telefon> getTelefonList() {
		return telefonList;
	}

}
