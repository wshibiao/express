package com.express.timer.impl;

import com.express.timer.IExecuteTimer;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by wshibiao on 2017/4/6.
 */
@Component
public class SendSMSTimer implements IExecuteTimer {
	// 每天早上8点
	@Scheduled(cron = "0 0 8 * * ?")
	@Override
	public void execute() {
		System.out.println("This is timer running");
	}
	
	//每隔3小时
	@Scheduled(cron = "0 0 0/3 * * ?")
	public void sendMessage(){
		System.out.println("This is send message timer running");
	}
}
