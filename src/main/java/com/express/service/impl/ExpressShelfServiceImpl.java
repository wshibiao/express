package com.express.service.impl;

import com.express.dao.ExpressShelfDao;
import com.express.service.ExpressShelfService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wshibiao on 2017/4/7.
 */
@Service
public class ExpressShelfServiceImpl implements ExpressShelfService{
    @Resource
    ExpressShelfDao expressShelfDao;
    // @Override
    // public ExpressShelf getShelfByExpressId(Long id) {
    //     return expressShelfDao.getShelfByExpressId(new Long(1));
    // }
}
