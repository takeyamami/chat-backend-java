package com.example.api.Controllers;

import java.util.List;

import com.example.api.Entity.Room;
import com.example.api.Repositories.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RoomController {
	@Autowired
	private RoomRepository roomRepository;

	@GetMapping("room/list/{id}")
	public List<Room> findRooms(@PathVariable("id") Long uid) {
		return roomRepository.findRooms(uid);
	}

}
