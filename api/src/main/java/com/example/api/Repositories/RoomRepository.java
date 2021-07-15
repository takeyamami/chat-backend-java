package com.example.api.Repositories;

import java.util.List;

import com.example.api.Entity.Room;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    
    @Query("SELECT r FROM Room r INNER JOIN r.roomMember m WHERE m.uid = :uid ORDER BY r.rid")
    public List<Room> findRooms(Long uid);
}
