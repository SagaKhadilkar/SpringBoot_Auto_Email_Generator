package com.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("$(spring.mail.username)")
	private String fromEmailId;
	
	public void sendEmail(String  recipient,String body,String subject) {
		
		SimpleMailMessage smm= new SimpleMailMessage();
		smm.setFrom(fromEmailId);
		smm.setTo(recipient);
		smm.setText(body);
		smm.setSubject(subject);
		
		javaMailSender.send(smm);
	}
	
}