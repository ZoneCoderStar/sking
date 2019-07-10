package com.sking.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sking.base_users")
public class BaseUsers {
    @Id
    private String userid;

    private String name;

    private Integer sex;

    private String loginnum;

    private String password;

    private String phone;

    private String email;

    private Integer state;

    @Column(name = "login_time")
    private Date loginTime;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "order_no")
    private Integer orderNo;

    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 删除标志（0代表存在 1代表删除）
     */
    @Column(name = "del_flag")
    private Integer delFlag;

    /**
     * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return loginnum
     */
    public String getLoginnum() {
        return loginnum;
    }

    /**
     * @param loginnum
     */
    public void setLoginnum(String loginnum) {
        this.loginnum = loginnum;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return login_time
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * @param loginTime
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * @return ip_address
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * @param ipAddress
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return order_no
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 获取删除标志（0代表存在 1代表删除）
     *
     * @return del_flag - 删除标志（0代表存在 1代表删除）
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标志（0代表存在 1代表删除）
     *
     * @param delFlag 删除标志（0代表存在 1代表删除）
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}