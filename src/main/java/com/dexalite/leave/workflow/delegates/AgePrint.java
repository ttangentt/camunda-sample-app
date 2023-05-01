package com.dexalite.leave.workflow.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("AgePrint")
public class AgePrint implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.print(execution.getVariable("result"));
		
	}

}
