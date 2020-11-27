package com.finalwebpro.ourfilm.bean;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import java.sql.Timestamp;
import java.util.Date;

public class Comment {
	protected int id;
	protected String name_film;
	protected String distributor_film;
	protected String comment_film;
	protected String date;
	protected String millis;
	
	public Comment(int id2, String name_film2, String distributor_film2, String comment_film2) {
		// TODO Auto-generated constructor stub
	}

	public void User() {
		
	}
	
	public void User(String name_film, String distributor_film, String comment_film) {
		super();
		this.name_film = name_film;
		this.distributor_film = distributor_film;
		this.comment_film = comment_film;
	}

	public void User(int id, String name_film, String distributor_film, String comment_film) {
		super();
		this.id = id;
		this.name_film = name_film;
		this.distributor_film = distributor_film;
		this.comment_film = comment_film;
	}

	public void main(String[] args) {
		// src: https://ramj2ee.blogspot.com/2018/12/how-to-create-javasqltimestamp-object.html
		long millis = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(millis);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getname_film() {
		return name_film;
	}
	public void setname_film(String name_film) {
		this.name_film = name_film;
	}
	public String getEmail() {
		return distributor_film;
	}
	public void setEmail(String distributor_film) {
		this.distributor_film = distributor_film;
	}
	public String getCountry() {
		return comment_film;
	}
	public void setCountry(String comment_film) {
		this.comment_film = comment_film;
	}
}
