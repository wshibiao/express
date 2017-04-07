package com.express.timer.impl;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.express.timer.IExecuteTimer;

@Component
public class ClearShelfTimer implements IExecuteTimer {
	
	// 每天凌晨12点00分00秒清除
	@Scheduled(cron = "0 0 0 * * ?")
	@Override
	public void execute() {
		System.out.println("This is the timer for clearing shelf");
	}

}
