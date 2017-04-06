package com.express.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wshibiao on 2017/4/5.
 */
public class Express implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;
    /**
     * ��ݵ���
     */
    private String expressNo;
    /**
     * �ļ�ʱ��
     */
    private Date fromDate;
    /**
     * ����ʱ��
     */
    private Date toDate;
    /**
     * ȡ��ʱ��
     */
    private Date getDate;
    /**
     * ��ϵ��ʽ
     */
    private String contact;
    /**
     * �ļ���ַ
     */
    private String addressSource;
    /**
     * �ռ���ַ
     */
    private String addressDest;
    /**
     * �ռ���
     */
    private String consignee;
    /**
     * ��ݹ�˾
     */
    private String company;
    /**
     * ȡ����֤��
     */
    private String verificationCode;
    /**
     * ���״̬
     */
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddressSource() {
        return addressSource;
    }

    public void setAddressSource(String addressSource) {
        this.addressSource = addressSource;
    }

    public String getAddressDest() {
        return addressDest;
    }

    public void setAddressDest(String addressDest) {
        this.addressDest = addressDest;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Date getGetDate() {
        return getDate;
    }

    public void setGetDate(Date getDate) {
        this.getDate = getDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
