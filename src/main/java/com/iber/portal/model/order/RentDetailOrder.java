package com.iber.portal.model.order;

/**
 * 
 * <br>
 * <b>功能：</b>RentDetailOrderEntity<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public class RentDetailOrder {
	
	private String status;// 订单状态(ordered finish cancel)
	
	public java.lang.String getBrandName() {
		return brandName;
	}
	public void setBrandName(java.lang.String brandName) {
		this.brandName = brandName;
	}
	public java.util.Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(java.util.Date beginTime) {
		this.beginTime = beginTime;
	}
	public java.lang.Integer getOrderDay() {
		return orderDay;
	}
	public void setOrderDay(java.lang.Integer orderDay) {
		this.orderDay = orderDay;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
