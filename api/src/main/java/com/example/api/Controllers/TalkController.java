package com.example.api.Controllers;

import java.util.List;

import com.example.api.Entity.Talk;
import com.example.api.Repositories.TalkRepository;

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
	public List<Talk> findTalks(@PathVariable("id") Long rid) {
		return talkRepository.findTalkMessage(rid);
	}

	@PostMapping("talk/create")
	public Talk save(@RequestBody Talk talk) {
		Talk talkObject = new Talk(talk.getRid(), talk.getUid(), talk.getMessage());

		return talkRepository.saveAndFlush(talkObject);
	}

}
