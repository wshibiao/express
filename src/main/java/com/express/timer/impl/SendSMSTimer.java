package com.express.timer.impl;

import com.express.timer.IExecuteTimer;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by wshibiao on 2017/4/6.
 */
@Component
public class SendSMSTimer implements IExecuteTimer {
    //每天早上8点
    @Scheduled(cron="0 00 08 * * ? * ")
    @Override
    public void execute() {

    }

}
