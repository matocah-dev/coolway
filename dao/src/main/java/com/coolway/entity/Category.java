package com.coolway.entity;

import java.util.Date;

public class Category {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.id
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.name
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.create_time
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.modify_time
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    private Date modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.id
     *
     * @return the value of category.id
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.id
     *
     * @param id the value for category.id
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.name
     *
     * @return the value of category.name
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.name
     *
     * @param name the value for category.name
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.create_time
     *
     * @return the value of category.create_time
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.create_time
     *
     * @param createTime the value for category.create_time
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.modify_time
     *
     * @return the value of category.modify_time
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.modify_time
     *
     * @param modifyTime the value for category.modify_time
     *
     * @mbggenerated Fri Oct 26 11:18:55 CST 2012
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}