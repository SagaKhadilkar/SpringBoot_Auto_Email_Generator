package com.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.email.service.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService  emailservice;

	@GetMapping("sendEmail")
	public String sendEmail() {
		emailservice.sendEmail("sagaruk143@gmail.com","Test Body","Test Subject");
		return "Send Successfully";
	}
}
// recipient 
