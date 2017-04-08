package com.express.service;

import com.express.model.OverDueExpress;

import java.util.List;

/**
 * Created by wshibiao on 2017/4/8.
 */
public interface OverDueExpressService {

    public OverDueExpress queryShelfByParams(OverDueExpress overDueExpress);
    public List getContactsWithOverDue();

}
