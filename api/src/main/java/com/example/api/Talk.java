package com.example.api;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "talks")
public class Talk implements Serializable {

	@Id
	@Column(name = "tid")
	private long tid;
	@Column(name = "rid")
	private long rid;
	@Column(name = "message")
	private String message;
	@Column(name = "created_at")
	private String created_at;
	
    @OneToOne
    @JoinColumn(name="room_id")
    private Room room;


	/**
	 * デフォルトコンストラクタ
	 */
	public Talk() {
		this.tid = 0;
		this.rid = 0;
		this.uid = 0;
		this.message = "";
	}

	/**
	 * コンストラクタ
	 * 
	 * @param tid
	 * @param rid
	 * @param uid
	 * @param message
	 */
	public Talk(long tid, long rid, long uid, String message) {
		this.tid = tid;
		this.rid = rid;
		this.uid = uid;
		this.message = message;
	}

	/**
	 * 
	 * @return tid
	 */
	public long getTid() {
		return tid;
	}

	/**
	 * 
	 * @return rid
	 */
	public long getRid() {
		return rid;
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
	 * @return message
	 */
	public String getMessage() {
		return message;
	}
}
