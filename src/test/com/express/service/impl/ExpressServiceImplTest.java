package com.express.service.impl;

import com.express.model.Express;
import com.express.service.ExpressService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * Created by wshibiao on 2017/4/7.
 */
@ContextConfiguration(locations={"classpath*:config/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ExpressServiceImplTest {
    @Autowired
    private ExpressService expressService;

    @Test
    public void queryExpressInfo() throws Exception {
        List<Express> expresses=expressService.queryExpressInfo("18689597978",null);
        Express express1=expressService.getExpressInfoById(new Long(1));
        for (Express express :
                expresses) {
            System.out.println(express.getExpressNo());
            System.out.println(express.getConsignee());
        }

    }

}