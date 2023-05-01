package com.dexalite.leave.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service("SendMail")
public class SendMail implements JavaDelegate{
	 @Autowired private JavaMailSender javaMailSender;

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		 SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo("glenabraham27@gmail.com");
	        message.setSubject("camunda test");
	        message.setText("shift");

	        javaMailSender.send(message);
		
	}
	
}
