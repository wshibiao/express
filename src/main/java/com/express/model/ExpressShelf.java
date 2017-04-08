package com.express.model;

import java.util.Date;

public class ExpressShelf {

	private int shelfId;

	private int expressInfoId;

	private Date createDate;

	private String status;

	public int getShelfId() {
		return shelfId;
	}

	public void setShelfId(int shelfId) {
		this.shelfId = shelfId;
	}

	public int getExpressinfoId() {
		return expressInfoId;
	}

	public void setExpressinfoId(int expressInfoId) {
		this.expressInfoId = expressInfoId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
