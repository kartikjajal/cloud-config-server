package com.config.server;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

	@RequestMapping("message")
	public String getMessage() {
		return "Hello World";
	}
	
}
