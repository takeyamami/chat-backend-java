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
@Table(name = "room_members")
public class RoomMember implements Serializable {

	@Id
	@Column(name = "rid")
	private long rid;
	@Id
	@Column(name = "uid")
	private long uid;

	/**
	 * デフォルトコンストラクタ
	 */
	public RoomMember() {
		this.rid = 0;
		this.uid = 0;
	}

	/**
	 * コンストラクタ
	 * 
	 * @param rid
	 * @param uid
	 */
	public RoomMember(long rid, long uid) {
		this.rid = rid;
		this.uid = uid;
	}

    @Override
    public String toString() {
        return "RoomMember{" +
                "rid='" + rid + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }
}
