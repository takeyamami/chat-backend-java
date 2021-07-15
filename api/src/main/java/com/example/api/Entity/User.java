package com.example.api.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "users")
public class User implements Serializable {

	@Id
	@Column(name = "uid")
	private long uid;
	@Column(name = "name")
	private String name;

	/**
	 * デフォルトコンストラクタ
	 */
	public User() {
		this.uid = 0;
		this.name = "";
	}

	/**
	 * コンストラクタ
	 * 
	 * @param uid
	 * @param name
	 */
	public User(long uid, String name) {
		this.uid = uid;
		this.name = name;
	}

    @Override
    public String toString() {
        return "user {" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
