package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController

public class DemoController {

	@Value("${example.username}")
	private String username;

	@Value("${example.notfromvault}")
	private String notfromvault;

	@RequestMapping("/greeting")
	public String greeting() {
		return username;
	}

	@RequestMapping("/notfromvault")
	public String notfromvault() {
		return notfromvault;
	}
}
