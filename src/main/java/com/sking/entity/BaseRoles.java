package com.sking.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sking.base_roles")
public class BaseRoles {
    @Id
    private String roleid;

    @Column(name = "role_name")
    private String roleName;

    private Integer state;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "order_no")
    private Integer orderNo;

    @Column(name = "role_level")
    private Integer roleLevel;

    @Column(name = "role_key")
    private String roleKey;
    /**
     * 删除标志（0代表存在 1代表删除）
     */
    @Column(name = "del_flag")
    private Integer delFlag;

    /**
     * @return roleid
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    /**
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    public Integer getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(Integer roleLevel) {
        this.roleLevel = roleLevel;
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

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }
}