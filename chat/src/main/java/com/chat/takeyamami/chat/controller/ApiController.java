package com.chat.takeyamami.chat.controller;
 
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class ApiController {
    @RequestMapping("/api/hello")
	public ResponseEntity hello(@RequestHeader("Origin") String origin) {
		System.out.println(origin);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Access-Control-Allow-Origin", origin);
		
		String body = "Hello GAE Java std env with Spring boot !";
		return new ResponseEntity<>(body, headers, HttpStatus.OK );
	}
}