package com.vzw.dvs.mtninfo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mtn_info")
@RefreshScope
public class Mtncontroller {


	@Value("${message}")
	private String message;

	@GetMapping("/getmessage")
	public String sayHello()
	{
		return message;
	}

}
