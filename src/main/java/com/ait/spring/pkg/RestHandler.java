package com.ait.spring.pkg;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHandler {

	@RequestMapping("/")
	public String index() {
		return "welcome ....";
	}

	@RequestMapping("/message")
	public String index(String message) {
		return message;
	}
}