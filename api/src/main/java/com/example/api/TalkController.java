package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TalkController {
	@Autowired
	private TalkRepository talkRepository;
	
	@GetMapping("talk/list/")
	public List<Talk> findTalks() {
		return talkRepository.findAll();
	}

	@GetMapping("talk/list/{id}")
	public List<Talk> findTalks(@PathVariable("id") Long rid) {
		return talkRepository.findByRidOrderByTid(rid);
	}

}
