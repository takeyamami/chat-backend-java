package com.example.api;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {

	@Id
	@Column(name = "uid")
	private long uid;
	@Column(name = "username")
	private String username;


	/**
	 * デフォルトコンストラクタ
	 */
	public User() {
		this.uid = 0;
		this.username = "";
	}

	/**
	 * コンストラクタ
	 * 
	 * @param uid
	 * @param username
	 */
	public User(long uid, String username) {
		this.uid = uid;
		this.username = username;
	}

	/**
	 * 
	 * @return uid
	 */
	public long getUid() {
		return uid;
	}

	/**
	 * 
	 * @return username
	 */
	public String getUsername() {
		return username;
	}
}
