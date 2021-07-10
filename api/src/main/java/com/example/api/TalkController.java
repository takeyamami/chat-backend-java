package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TalkController {
	@Autowired
	private TalkRepository talkRepository;

	@GetMapping("talk/list/{id}")
	public List<Object> findTalks(@PathVariable("id") Long rid) {
		return talkRepository.findTalkMessage(rid);
	}

	@PostMapping("talk/create")
	public Talk save(@RequestBody Talk talk) {
		return talkRepository.save(talk);
	}

}
