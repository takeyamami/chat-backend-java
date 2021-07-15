package com.example.api.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "rooms")
public class Room implements Serializable {

	@Id
	@Column(name = "rid")
	private long rid;
	@Column(name = "name")
	private String name;

	@OneToMany
	@JoinColumn(name="rid", insertable=false, updatable=false)
	private List<RoomMember> roomMember;


	/**
	 * デフォルトコンストラクタ
	 */
	public Room() {
		this.rid = 0;
		this.name = "";

		this.roomMember = new ArrayList<RoomMember>();
	}

	/**
	 * コンストラクタ
	 * 
	 * @param rid
	 * @param name
	 * @param roomMember
	 */
	public Room(long rid, String name, List<RoomMember> roomMember) {
		this.rid = rid;
		this.name = name;
		this.roomMember = roomMember;
	}

    @Override
    public String toString() {
        return "Room{" +
                "rid='" + rid + '\'' +
                ", name='" + name + '\'' +
                ", roomMember='" + roomMember.toString() + '\'' +
                '}';
    }
}
