package com.iber.portal.model.coupon;

/**
 * 
 * <br>
 * <b>功能：</b>XCouponLogEntity<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public class CouponLog {
	
	
	private String  memberName;
	private String 	memberPhone;
	private String  createName;
	private Integer couponNum;
	
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public Integer getCouponNum() {
		return couponNum;
	}
	public void setCouponNum(Integer couponNum) {
		this.couponNum = couponNum;
	}
	public String getCreateName() {
		return createName;
	}
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public java.lang.Integer getId() {
}
