package com.chat.application.model;

public class Room {
    private Integer rid;
    private String roomName;

    public Room(Integer rid, String roomName) {
        this.rid = rid;
        this.roomName = roomName;
    }

    public Integer getRid() {
        return this.rid;
    }

    public String getRoomName() {
        return this.roomName;
    }
}
