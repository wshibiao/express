package com.express.dao;

import org.apache.ibatis.annotations.Param;

import com.express.model.Express;

import java.util.Date;

/**
 * Created by wshibiao on 2017/4/5.
 */
public interface ExpressDao {
    /**
     *��������Ϣ
     * @param express
     */
    public void insertExpressInfo(Express express);

    /**
     * ���¿��״̬
     * @param expressNo
     * @param status
     * @param getDate
     */
    public void updateExpressInfo(@Param("expressNo")String expressNo, @Param("status")String status
            , @Param("getDate")Date getDate);

    /**
     * ��ѯ���
     * @param expressNo
     * @param contact
     * @param toDate
     * @return
     */
    public Express queryExpressInfo(@Param("expressNo")String expressNo, @Param("contact")String contact
            , @Param("toDate")Date toDate);

}
