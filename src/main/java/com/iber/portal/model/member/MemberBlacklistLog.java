package com.iber.portal.model.member;

/**
 * 
 * <br>
 * <b>功能：</b>MemberBlacklistLogEntity<br>
 * <b>作者：</b>www.jeecg.org<br>
 * <b>日期：</b> Feb 2, 2013 <br>
 * <b>版权所有：<b>版权所有(C) 2013，www.jeecg.org<br>
 */
public class MemberBlacklistLog {
	
	
	private String memberName;
	private String createName;
	private String updateName;
	private String memberPhone;
	public java.lang.Integer getId() {
		return id;
	}
	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	public java.lang.Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(java.lang.Integer memberId) {
		this.memberId = memberId;
	}
	public java.lang.String getReason() {
		return reason;
	}
	public void setReason(java.lang.String reason) {
		this.reason = reason;
	}
	public java.lang.Integer getCreateId() {
		return createId;
	}
	public void setCreateId(java.lang.Integer createId) {
		this.createId = createId;
	}
	public java.util.Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	public java.lang.Integer getUpdateId() {
		return updateId;
	}
	public void setUpdateId(java.lang.Integer updateId) {
		this.updateId = updateId;
	}
	public java.util.Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
	public java.lang.Integer getOperate() {
		return operate;
	}
	public void setOperate(java.lang.Integer operate) {
		this.operate = operate;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getCreateName() {
		return createName;
	}
	public void setCreateName(String createName) {
		this.createName = createName;
	}
	public String getUpdateName() {
		return updateName;
	}
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
}
