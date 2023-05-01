package com.dexalite.leave.workflow.delegates;

import java.util.Properties;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("SendTask")
public class SendTask implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("Delegates");
		
		Properties props = new Properties();
		System.out.println(props.getProperty("mail.smtp.host"));
	}
	
}
