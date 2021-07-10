package com.example.api;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	@Column(name = "tid")
	private long tid;
	@Column(name = "rid")
	private long rid;
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
		this.message = "";
		this.created_at = new Date();
		this.user = new User();
	}

	/**
	 * コンストラクタ
	 * 
	 * @param tid
	 * @param rid
	 * @param message
	 * @param created_at
	 * @param user
	 */
	public Talk(long tid, long rid, String message, Date created_at, User user) {
		this.tid = tid;
		this.rid = rid;
		this.message = message;
		this.created_at = created_at;
		this.user = user;
	}

    @Override
    public String toString() {
        return "Talk{" +
                "tid='" + tid + '\'' +
                ", rid='" + rid + '\'' +
                ", message='" + message + '\'' +
                ", created_at='" + created_at + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
