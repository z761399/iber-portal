package com.iber.portal.model.task;

import java.io.Serializable;
import java.util.Date;

public class TaskScoreStrategy implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_task_score_strategy.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_task_score_strategy.city_code
     *
     * @mbggenerated
     */
    private String cityCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_task_score_strategy.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_task_score_strategy.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_task_score_strategy.score
     *
     * @mbggenerated
     */
    private double score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_task_score_strategy.creator
     *
     * @mbggenerated
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_task_score_strategy.modifier
     *
     * @mbggenerated
     */
    private String modifier;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_task_score_strategy.maintain_type
     *
     * @mbggenerated
     */
    private Integer maintainType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_task_score_strategy.min_mileage
     *
     * @mbggenerated
     */
    private Double minMileage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column e_task_score_strategy.max_mileage
     *
     * @mbggenerated
     */
    private Double maxMileage;

    private Boolean isShow;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table e_task_score_strategy
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_task_score_strategy.id
     *
     * @return the value of e_task_score_strategy.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_task_score_strategy.id
     *
     * @param id the value for e_task_score_strategy.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_task_score_strategy.city_code
     *
     * @return the value of e_task_score_strategy.city_code
     *
     * @mbggenerated
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_task_score_strategy.city_code
     *
     * @param cityCode the value for e_task_score_strategy.city_code
     *
     * @mbggenerated
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_task_score_strategy.type
     *
     * @return the value of e_task_score_strategy.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_task_score_strategy.type
     *
     * @param type the value for e_task_score_strategy.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_task_score_strategy.create_time
     *
     * @return the value of e_task_score_strategy.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_task_score_strategy.create_time
     *
     * @param createTime the value for e_task_score_strategy.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_task_score_strategy.score
     *
     * @return the value of e_task_score_strategy.score
     *
     * @mbggenerated
     */
    public double getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_task_score_strategy.score
     *
     * @param score the value for e_task_score_strategy.score
     *
     * @mbggenerated
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_task_score_strategy.creator
     *
     * @return the value of e_task_score_strategy.creator
     *
     * @mbggenerated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_task_score_strategy.creator
     *
     * @param creator the value for e_task_score_strategy.creator
     *
     * @mbggenerated
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_task_score_strategy.modifier
     *
     * @return the value of e_task_score_strategy.modifier
     *
     * @mbggenerated
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_task_score_strategy.modifier
     *
     * @param modifier the value for e_task_score_strategy.modifier
     *
     * @mbggenerated
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_task_score_strategy.maintain_type
     *
     * @return the value of e_task_score_strategy.maintain_type
     *
     * @mbggenerated
     */
    public Integer getMaintainType() {
        return maintainType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_task_score_strategy.maintain_type
     *
     * @param maintainType the value for e_task_score_strategy.maintain_type
     *
     * @mbggenerated
     */
    public void setMaintainType(Integer maintainType) {
        this.maintainType = maintainType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_task_score_strategy.min_mileage
     *
     * @return the value of e_task_score_strategy.min_mileage
     *
     * @mbggenerated
     */
    public Double getMinMileage() {
        return minMileage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_task_score_strategy.min_mileage
     *
     * @param minMileage the value for e_task_score_strategy.min_mileage
     *
     * @mbggenerated
     */
    public void setMinMileage(Double minMileage) {
        this.minMileage = minMileage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column e_task_score_strategy.max_mileage
     *
     * @return the value of e_task_score_strategy.max_mileage
     *
     * @mbggenerated
     */
    public Double getMaxMileage() {
        return maxMileage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column e_task_score_strategy.max_mileage
     *
     * @param maxMileage the value for e_task_score_strategy.max_mileage
     *
     * @mbggenerated
     */
    public void setMaxMileage(Double maxMileage) {
        this.maxMileage = maxMileage;
    }

    public Boolean getShow() {
        return isShow;
    }

    public void setShow(Boolean show) {
        isShow = show;
    }
}