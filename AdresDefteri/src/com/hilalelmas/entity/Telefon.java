package com.hilalelmas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Telefon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="tel_id")
	int idTel;
	String telno;

	public int getIdTel() {
		return idTel;
	}

	public void setIdTel(int idTel) {
		this.idTel = idTel;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

}
