package com.hilalelmas.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.hilalelmas.entity.Kisi;

public class DataBase {
	public void kisiEkle(Kisi kisi) {

		String url = "jdbc:mysql://localhost:3306/adres_defteri";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			return;
		}
		
		
		try {
			Connection con = 
		DriverManager.getConnection(url, "root", "hilal2603");
			
			if(con != null)
				System.out.println("baglandi");
			
		String SQL = "INSERT INTO KÝSÝ"
				+ " (idkisi,name,surname,eposta)"
				+ " values(%s,'%s','%s','%s')";
		
		SQL = String.format(SQL,kisi.getIdkisi(),kisi.getName(),kisi.getSurname(),kisi.getEposta());
		
		Statement statement = con.createStatement();
		statement.execute(SQL);
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
