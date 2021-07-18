package com.example.api.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "talks")
public class Talk implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tid")
	private long tid;
	@Column(name = "rid")
	private long rid;
	@Column(name = "uid")
	private long uid;
	@Column(name = "message")
	private String message;
    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at")
	private Date created_at;

	@OneToOne
	@JoinColumn(name="uid", insertable=false, updatable=false)
	private User user;


	/**
	 * デフォルトコンストラクタ
	 */
	public Talk() {
		this.tid = 0;
		this.rid = 0;
		this.uid = 0;
		this.message = "";
		this.created_at = new Date();
		this.user = new User();
	}

	/**
	 * コンストラクタ
	 * 
	 * @param rid
	 * @param uid
	 * @param message
	 */
	public Talk(long rid, long uid, String message) {
		this.rid = rid;
		this.uid = uid;
		this.message = message;
		this.created_at = new Date();
	}

    @Override
    public String toString() {
        return "Talk{" +
                "tid='" + tid + '\'' +
                ", rid='" + rid + '\'' +
                ", uid='" + uid + '\'' +
                ", message='" + message + '\'' +
                ", created_at='" + created_at + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
