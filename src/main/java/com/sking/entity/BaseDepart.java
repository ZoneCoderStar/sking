package com.sking.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "sking..base_depart")
public class BaseDepart {
    /**
     * 部门id
     */
    @Id
    @Column(name = "depart_id")
    private Long departId;

    /**
     * 父部门id
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 祖级列表
     */
    private String ancestors;

    /**
     * 部门名称
     */
    @Column(name = "depart_name")
    private String departName;

    /**
     * 显示顺序
     */
    @Column(name = "order_num")
    private Integer orderNum;

    /**
     * 负责人
     */
    private String leader;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 部门状态（1正常 0停用）
     */
    private Integer status;

    /**
     * 删除标志（0代表存在 1代表删除）
     */
    @Column(name = "del_flag")
    private Integer delFlag;

    /**
     * 创建者
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新者
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取部门id
     *
     * @return depart_id - 部门id
     */
    public Long getDepartId() {
        return departId;
    }

    /**
     * 设置部门id
     *
     * @param departId 部门id
     */
    public void setDepartId(Long departId) {
        this.departId = departId;
    }

    /**
     * 获取父部门id
     *
     * @return parent_id - 父部门id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父部门id
     *
     * @param parentId 父部门id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取祖级列表
     *
     * @return ancestors - 祖级列表
     */
    public String getAncestors() {
        return ancestors;
    }

    /**
     * 设置祖级列表
     *
     * @param ancestors 祖级列表
     */
    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    /**
     * 获取部门名称
     *
     * @return depart_name - 部门名称
     */
    public String getDepartName() {
        return departName;
    }

    /**
     * 设置部门名称
     *
     * @param departName 部门名称
     */
    public void setDepartName(String departName) {
        this.departName = departName;
    }

    /**
     * 获取显示顺序
     *
     * @return order_num - 显示顺序
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * 设置显示顺序
     *
     * @param orderNum 显示顺序
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取负责人
     *
     * @return leader - 负责人
     */
    public String getLeader() {
        return leader;
    }

    /**
     * 设置负责人
     *
     * @param leader 负责人
     */
    public void setLeader(String leader) {
        this.leader = leader;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取部门状态（1正常 0停用）
     *
     * @return status - 部门状态（1正常 0停用）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置部门状态（1正常 0停用）
     *
     * @param status 部门状态（1正常 0停用）
     */
    public void setStatus(Integer status) {
        this.status = status;
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

    /**
     * 获取创建者
     *
     * @return create_by - 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建者
     *
     * @param createBy 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新者
     *
     * @return update_by - 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新者
     *
     * @param updateBy 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}