package com.express.dao;

import com.express.model.Express;
import org.apache.ibatis.annotations.Param;

/**
 * Created by wshibiao on 2017/4/6.
 */
public interface ExpressDao {
    /**
     * 查询快递的信息
     * @param contact
     * @param expressNo
     * @return
     */
    public Express queryExpressInfo(@Param("contact")String contact, @Param("expressNo")String expressNo);

    /**
     *
     * @param expressNo
     */
    public void deleteExpress(@Param("expressNo")String expressNo);
}
