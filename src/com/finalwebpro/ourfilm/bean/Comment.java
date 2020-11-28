package com.finalwebpro.ourfilm.bean;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
import java.sql.Timestamp;
import java.util.Date;

public class Comment {
	protected int id;
	protected String name_film;
	protected String distributor_film;
	protected String comment_film;
	protected String date_comment;
	//protected String millis;
	
	//public Comment(int id2, String name_film2, String distributor_film2, String comment_film2) {
		// TODO Auto-generated constructor stub
	//}

	public void User() {
		
	}
	
	public void User(String name_film, String distributor_film, String comment_film, String date_comment) {
		super();
		this.name_film = name_film;
		this.distributor_film = distributor_film;
		this.comment_film = comment_film;
		this.date_comment = date_comment;
	}

	public void User(int id, String name_film, String distributor_film, String comment_film) {
		super();
		this.id = id;
		this.name_film = name_film;
		this.distributor_film = distributor_film;
		this.comment_film = comment_film;
		this.date_comment = date_comment;
	}

	//public void main(String[] args) {
		// src: https://ramj2ee.blogspot.com/2018/12/how-to-create-javasqltimestamp-object.html
		//long millis = System.currentTimeMillis();
        //Timestamp timestamp = new Timestamp(millis);
	//}
	
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
	public String getdistributor_film() {
		return distributor_film;
	}
	public void setdistributor_film(String distributor_film) {
		this.distributor_film = distributor_film;
	}
	public String getcomment_film() {
		return comment_film;
	}
	public void setcomment_film(String comment_film) {
		this.comment_film = comment_film;
	}
	public String getdate_comment() {
		return date_comment;
	}
	public void setdate_comment(String comment_film) {
		this.date_comment = date_comment;
	}
}
