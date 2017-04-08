package com.express.model;

import java.util.Date;

public class OverDueExpress {
	
	private int overDueShelfId;

	private int expressinfoId;

	private Date createDate;

	private String status;

	public int getOverDueShelfId() {
		return overDueShelfId;
	}

	public void setOverDueShelfId(int overDueShelfId) {
		this.overDueShelfId = overDueShelfId;
	}

	public int getExpressinfoId() {
		return expressinfoId;
	}

	public void setExpressinfoId(int expressinfoId) {
		this.expressinfoId = expressinfoId;
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
