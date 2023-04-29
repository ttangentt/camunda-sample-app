package com.dexalite.leave.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service("LeaveBalanceCheck")
public class LeaveBalanceCheck implements JavaDelegate{
	public static final int LEAVE_BALANCE = 5;
	private final Logger logger = LoggerFactory.getLogger(this.getClass()); 
	@SuppressWarnings("unused")
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		if(LEAVE_BALANCE>0)
			logger.info("Employee have leave balance");
		else
			logger.error("Employee does'nt have leave balance");
	}
	
}
