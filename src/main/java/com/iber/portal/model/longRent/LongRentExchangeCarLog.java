package com.iber.portal.model.longRent;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zengfy
 */
public class LongRentExchangeCarLog implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_long_rent_exchange_car_log.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_long_rent_exchange_car_log.order_id
     *
     * @mbggenerated
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_long_rent_exchange_car_log.before_lpn
     *
     * @mbggenerated
     */
    private String beforeLpn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_long_rent_exchange_car_log.after_lpn
     *
     * @mbggenerated
     */
    private String afterLpn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_long_rent_exchange_car_log.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_long_rent_exchange_car_log.create_user
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_long_rent_exchange_car_log.reason
     *
     * @mbggenerated
     */
    private String reason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_long_rent_exchange_car_log.begin_time
     *
     * @mbggenerated
     */
    private Date beginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_long_rent_exchange_car_log.end_time
     *
     * @mbggenerated
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_long_rent_exchange_car_log.mileage
     *
     * @mbggenerated
     */
    private Double mileage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x_long_rent_exchange_car_log.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x_long_rent_exchange_car_log
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_long_rent_exchange_car_log.id
     *
     * @return the value of x_long_rent_exchange_car_log.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_long_rent_exchange_car_log.id
     *
     * @param id the value for x_long_rent_exchange_car_log.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_long_rent_exchange_car_log.order_id
     *
     * @return the value of x_long_rent_exchange_car_log.order_id
     *
     * @mbggenerated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_long_rent_exchange_car_log.order_id
     *
     * @param orderId the value for x_long_rent_exchange_car_log.order_id
     *
     * @mbggenerated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_long_rent_exchange_car_log.before_lpn
     *
     * @return the value of x_long_rent_exchange_car_log.before_lpn
     *
     * @mbggenerated
     */
    public String getBeforeLpn() {
        return beforeLpn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_long_rent_exchange_car_log.before_lpn
     *
     * @param beforeLpn the value for x_long_rent_exchange_car_log.before_lpn
     *
     * @mbggenerated
     */
    public void setBeforeLpn(String beforeLpn) {
        this.beforeLpn = beforeLpn == null ? null : beforeLpn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_long_rent_exchange_car_log.after_lpn
     *
     * @return the value of x_long_rent_exchange_car_log.after_lpn
     *
     * @mbggenerated
     */
    public String getAfterLpn() {
        return afterLpn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_long_rent_exchange_car_log.after_lpn
     *
     * @param afterLpn the value for x_long_rent_exchange_car_log.after_lpn
     *
     * @mbggenerated
     */
    public void setAfterLpn(String afterLpn) {
        this.afterLpn = afterLpn == null ? null : afterLpn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_long_rent_exchange_car_log.create_time
     *
     * @return the value of x_long_rent_exchange_car_log.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_long_rent_exchange_car_log.create_time
     *
     * @param createTime the value for x_long_rent_exchange_car_log.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_long_rent_exchange_car_log.create_user
     *
     * @return the value of x_long_rent_exchange_car_log.create_user
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_long_rent_exchange_car_log.create_user
     *
     * @param createUser the value for x_long_rent_exchange_car_log.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_long_rent_exchange_car_log.reason
     *
     * @return the value of x_long_rent_exchange_car_log.reason
     *
     * @mbggenerated
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_long_rent_exchange_car_log.reason
     *
     * @param reason the value for x_long_rent_exchange_car_log.reason
     *
     * @mbggenerated
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_long_rent_exchange_car_log.begin_time
     *
     * @return the value of x_long_rent_exchange_car_log.begin_time
     *
     * @mbggenerated
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_long_rent_exchange_car_log.begin_time
     *
     * @param beginTime the value for x_long_rent_exchange_car_log.begin_time
     *
     * @mbggenerated
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_long_rent_exchange_car_log.end_time
     *
     * @return the value of x_long_rent_exchange_car_log.end_time
     *
     * @mbggenerated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_long_rent_exchange_car_log.end_time
     *
     * @param endTime the value for x_long_rent_exchange_car_log.end_time
     *
     * @mbggenerated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_long_rent_exchange_car_log.mileage
     *
     * @return the value of x_long_rent_exchange_car_log.mileage
     *
     * @mbggenerated
     */
    public Double getMileage() {
        return mileage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_long_rent_exchange_car_log.mileage
     *
     * @param mileage the value for x_long_rent_exchange_car_log.mileage
     *
     * @mbggenerated
     */
    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x_long_rent_exchange_car_log.address
     *
     * @return the value of x_long_rent_exchange_car_log.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x_long_rent_exchange_car_log.address
     *
     * @param address the value for x_long_rent_exchange_car_log.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_long_rent_exchange_car_log
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LongRentExchangeCarLog other = (LongRentExchangeCarLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getBeforeLpn() == null ? other.getBeforeLpn() == null : this.getBeforeLpn().equals(other.getBeforeLpn()))
            && (this.getAfterLpn() == null ? other.getAfterLpn() == null : this.getAfterLpn().equals(other.getAfterLpn()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getBeginTime() == null ? other.getBeginTime() == null : this.getBeginTime().equals(other.getBeginTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getMileage() == null ? other.getMileage() == null : this.getMileage().equals(other.getMileage()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_long_rent_exchange_car_log
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getBeforeLpn() == null) ? 0 : getBeforeLpn().hashCode());
        result = prime * result + ((getAfterLpn() == null) ? 0 : getAfterLpn().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getBeginTime() == null) ? 0 : getBeginTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getMileage() == null) ? 0 : getMileage().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_long_rent_exchange_car_log
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", beforeLpn=").append(beforeLpn);
        sb.append(", afterLpn=").append(afterLpn);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", reason=").append(reason);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", mileage=").append(mileage);
        sb.append(", address=").append(address);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}